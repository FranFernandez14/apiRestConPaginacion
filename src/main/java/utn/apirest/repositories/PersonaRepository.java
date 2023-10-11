package utn.apirest.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import utn.apirest.entities.Persona;
@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    @Query(
            value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:nombre%"
    )
    Page<Persona> buscarPorNombre(@Param("nombre") String nombre, Pageable pageable);

}
