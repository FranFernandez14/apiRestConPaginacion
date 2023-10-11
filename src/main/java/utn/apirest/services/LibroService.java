package utn.apirest.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import utn.apirest.entities.Libro;

public interface LibroService extends BaseService<Libro,Long>{
    Page<Libro> buscarPorTitulo(String titulo, Pageable pageable) throws Exception;

    Page<Libro> buscarPorAutor(String filtro, Pageable pageable) throws Exception;
}
