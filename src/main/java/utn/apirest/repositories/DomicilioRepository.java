package utn.apirest.repositories;

import org.springframework.stereotype.Repository;
import utn.apirest.entities.Domicilio;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long> {
}
