package br.com.alura.screensound.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity // Indica que esta classe é uma entidade JPA que será mapeada para uma tabela no banco de dados.
@Table(name = "artistas") // Define o nome da tabela no banco de dados como "artistas".
public class Artista {

    @Id // Marca o campo como a chave primária da entidade.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O valor do ID será gerado automaticamente pelo banco de dados.
    private Long id; // Identificador único da entidade.

    @Column(unique = true) // Define a coluna "nome" como única, ou seja, não pode haver dois artistas com o mesmo nome.
    private String nome; // Nome do artista.

    @Enumerated(EnumType.STRING) // Armazena o valor do enum como uma string no banco de dados.
    private TipoArtista tipo; // Tipo do artista, que será do tipo enum `TipoArtista`.

    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // Define o relacionamento de um-para-muitos com a entidade `Musica`. A entidade `Musica` tem um campo "artista" que referencia esta classe.
    // `cascade = CascadeType.ALL` significa que todas as operações (como persistir ou remover) feitas na entidade `Artista` serão propagadas para a lista de músicas.
    // `fetch = FetchType.EAGER` define que as músicas associadas serão carregadas imediatamente quando um artista for carregado.
    private List<Musica> musicas = new ArrayList<>(); // Lista de músicas associadas ao artista.

    // Construtor padrão sem argumentos.
    public Artista() {}

    // Construtor que inicializa o artista com um nome e tipo.
    public Artista(String nome, TipoArtista tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Getter para o campo `id`.
    public Long getId() {
        return id;
    }

    // Setter para o campo `id`.
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para o campo `nome`.
    public String getNome() {
        return nome;
    }

    // Setter para o campo `nome`.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o campo `tipo`.
    public TipoArtista getTipo() {
        return tipo;
    }

    // Setter para o campo `tipo`.
    public void setTipo(TipoArtista tipo) {
        this.tipo = tipo;
    }

    // Getter para a lista de músicas associadas ao artista.
    public List<Musica> getMusicas() {
        return musicas;
    }

    // Setter para a lista de músicas.
    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    // Método que retorna uma representação em string do artista, incluindo nome, tipo e lista de músicas.
    @Override
    public String toString() {
        return
                "Artista='" + nome + '\'' +
                        ", tipo=" + tipo +
                        ", musicas=" + musicas;
    }
}
