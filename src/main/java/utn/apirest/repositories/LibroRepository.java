package utn.apirest.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import utn.apirest.entities.Libro;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long>{

    Page<Libro> findByTituloContaining(String titulo, Pageable pageable);

    @Query(
            value = "select libro.* from libro " +
                    "join libro_autor on libro.id = libro_autor.id_libro " +
                    "join autor on libro_autor.id_autor = autor.id " +
                    "where autor.nombre like %:filtro% or autor.apellido like %:filtro%",
            nativeQuery = true
    )
    Page<Libro> buscarPorAutor(String filtro, Pageable pageable);

}
