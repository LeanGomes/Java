package br.com.alura.screensound.repository;

import br.com.alura.screensound.model.Artista;
import br.com.alura.screensound.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
    // Método para buscar um artista pelo nome, ignorando maiúsculas e minúsculas.
    // Retorna um Optional que contém o artista encontrado ou vazio caso não haja correspondência.
    Optional<Artista> findByNomeContainingIgnoreCase(String nome);

    // Consulta personalizada para buscar músicas de um artista com nome semelhante (ignora maiúsculas e minúsculas).
    // Utiliza a cláusula JOIN para associar os artistas às suas músicas e o operador ILIKE para realizar a busca parcial no nome do artista.
    @Query("SELECT m FROM Artista a JOIN a.musicas m WHERE a.nome ILIKE %:nome%")
    List<Musica> buscaMusicasPorArtista(String nome);
}
