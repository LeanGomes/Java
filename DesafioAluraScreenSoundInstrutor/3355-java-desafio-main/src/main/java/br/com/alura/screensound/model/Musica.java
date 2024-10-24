package br.com.alura.screensound.model;

import jakarta.persistence.*;

@Entity // Indica que esta classe é uma entidade JPA que será mapeada para uma tabela no banco de dados.
@Table(name = "musicas") // Define o nome da tabela no banco de dados como "musicas".
public class Musica {

    @Id // Marca o campo como a chave primária da entidade.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O valor do ID será gerado automaticamente pelo banco de dados.
    private Long id; // Identificador único da música.

    private String titulo; // Título da música.

    @ManyToOne // Indica uma relação muitos-para-um com a entidade `Artista`. Muitas músicas podem pertencer a um único artista.
    private Artista artista; // Referência ao artista que executa esta música.

    // Construtor padrão sem argumentos.
    public Musica() {}

    // Construtor que inicializa a música com um título.
    public Musica(String nomeMusica) {
        this.titulo = nomeMusica;
    }

    // Getter para o campo `id`.
    public Long getId() {
        return id;
    }

    // Setter para o campo `id`.
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para o campo `titulo`.
    public String getTitulo() {
        return titulo;
    }

    // Setter para o campo `titulo`.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para o campo `artista`.
    public Artista getArtista() {
        return artista;
    }

    // Setter para o campo `artista`.
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    // Método que retorna uma representação em string da música, incluindo o título e o nome do artista.
    @Override
    public String toString() {
        return
                "Música='" + titulo + '\'' +
                        ", artista=" + artista.getNome(); // Exibe o nome do artista associado à música.
    }
}
