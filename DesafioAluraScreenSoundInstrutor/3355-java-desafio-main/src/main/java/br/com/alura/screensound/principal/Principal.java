package br.com.alura.screensound.principal;

import br.com.alura.screensound.model.Artista;
import br.com.alura.screensound.model.Musica;
import br.com.alura.screensound.model.TipoArtista;
import br.com.alura.screensound.repository.ArtistaRepository;
import br.com.alura.screensound.service.ConsultaChatGPT;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private final ArtistaRepository repositorio; // Dependência para acessar o repositório de artistas.
    private Scanner leitura = new Scanner(System.in); // Scanner para leitura de entradas do usuário.

    // Construtor que inicializa a classe com uma instância do repositório de artistas.
    public Principal(ArtistaRepository repositorio) {
        this.repositorio = repositorio;
    }

    // Método que exibe o menu principal e gerencia as opções escolhidas pelo usuário.
    public void exibeMenu() {
        var opcao = -1; // Inicializa a variável 'opcao' com -1 para garantir que o menu será exibido ao menos uma vez.

        while (opcao != 9) { // Loop do menu, encerra quando a opção for 9.
            var menu = """
                    *** Screen Sound Músicas ***                    
                                        
                    1- Cadastrar artistas
                    2- Cadastrar músicas
                    3- Listar músicas
                    4- Buscar músicas por artistas
                    5- Pesquisar dados sobre um artista
                                    
                    9 - Sair
                    """;

            System.out.println(menu); // Exibe o menu.
            opcao = leitura.nextInt(); // Lê a opção do usuário.
            leitura.nextLine(); // Consome a nova linha após o `nextInt()`.

            // Escolha da ação baseada na opção selecionada.
            switch (opcao) {
                case 1:
                    cadastrarArtistas(); // Chama o método para cadastrar artistas.
                    break;
                case 2:
                    cadastrarMusicas(); // Chama o método para cadastrar músicas.
                    break;
                case 3:
                    listarMusicas(); // Chama o método para listar músicas.
                    break;
                case 4:
                    buscarMusicasPorArtista(); // Chama o método para buscar músicas por artista.
                    break;
                case 5:
                    pesquisarDadosDoArtista(); // Chama o método para pesquisar dados de um artista.
                    break;
                case 9:
                    System.out.println("Encerrando a aplicação!"); // Mensagem ao encerrar o programa.
                    break;
                default:
                    System.out.println("Opção inválida!"); // Mensagem para opções inválidas.
            }
        }
    }

    // Método para pesquisar dados de um artista usando uma API externa.
    private void pesquisarDadosDoArtista() {
        System.out.println("Pesquisar dados sobre qual artista? ");
        var nome = leitura.nextLine(); // Lê o nome do artista a ser pesquisado.
        var resposta = ConsultaChatGPT.obterInformacao(nome); // Chama o método de consulta externa (ex: API do ChatGPT).
        System.out.println(resposta.trim()); // Exibe a resposta formatada.
    }

    // Método para buscar músicas por artista.
    private void buscarMusicasPorArtista() {
        System.out.println("Buscar músicas de que artista? ");
        var nome = leitura.nextLine(); // Lê o nome do artista para busca.
        List<Musica> musicas = repositorio.buscaMusicasPorArtista(nome); // Consulta o repositório para encontrar as músicas do artista.
        musicas.forEach(System.out::println); // Exibe cada música encontrada.
    }

    // Método para listar todas as músicas de todos os artistas.
    private void listarMusicas() {
        List<Artista> artistas = repositorio.findAll(); // Consulta todos os artistas no repositório.
        artistas.forEach(a -> a.getMusicas().forEach(System.out::println)); // Para cada artista, exibe suas músicas.
    }

    // Método para cadastrar novas músicas a um artista.
    private void cadastrarMusicas() {
        System.out.println("Cadastrar música de que artista? ");
        var nome = leitura.nextLine(); // Lê o nome do artista.
        Optional<Artista> artista = repositorio.findByNomeContainingIgnoreCase(nome); // Busca o artista no repositório ignorando maiúsculas/minúsculas.
        if (artista.isPresent()) { // Se o artista for encontrado.
            System.out.println("Informe o título da música: ");
            var nomeMusica = leitura.nextLine(); // Lê o título da nova música.
            Musica musica = new Musica(nomeMusica); // Cria uma nova instância de Musica com o título informado.
            musica.setArtista(artista.get()); // Associa a música ao artista.
            artista.get().getMusicas().add(musica); // Adiciona a música na lista de músicas do artista.
            repositorio.save(artista.get()); // Salva o artista atualizado no repositório.
        } else {
            System.out.println("Artista não encontrado"); // Mensagem caso o artista não seja encontrado.
        }
    }

    // Método para cadastrar novos artistas.
    private void cadastrarArtistas() {
        var cadastrarNovo = "S"; // Inicializa a variável para continuar cadastrando artistas.

        while (cadastrarNovo.equalsIgnoreCase("s")) { // Loop para cadastrar enquanto o usuário desejar.
            System.out.println("Informe o nome desse artista: ");
            var nome = leitura.nextLine(); // Lê o nome do artista.
            System.out.println("Informe o tipo desse artista: (solo, dupla ou banda)");
            var tipo = leitura.nextLine(); // Lê o tipo do artista.
            TipoArtista tipoArtista = TipoArtista.valueOf(tipo.toUpperCase()); // Converte o tipo informado para o enum `TipoArtista`.
            Artista artista = new Artista(nome, tipoArtista); // Cria uma nova instância de Artista com o nome e tipo fornecidos.
            repositorio.save(artista); // Salva o artista no repositório.
            System.out.println("Cadastrar novo artista? (S/N)"); // Pergunta se deseja cadastrar outro artista.
            cadastrarNovo = leitura.nextLine(); // Lê a resposta do usuário.
        }
    }
}

