import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consulta = new ConsultaCep();

        System.out.println("Digite um CEP:");
        var cep = scanner.nextLine();


        try {
            Endereco novoEndereco = consulta.buscarEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvarArquivo(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}
