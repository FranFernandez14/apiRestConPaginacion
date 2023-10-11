package utn.apirest.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import utn.apirest.entities.Persona;

public interface PersonaService extends BaseService<Persona,Long>{
    Page<Persona> buscarPorNombre(String nombre, Pageable pageable) throws Exception;
}
