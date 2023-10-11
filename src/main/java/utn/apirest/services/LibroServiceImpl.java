package utn.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import utn.apirest.entities.Libro;
import utn.apirest.repositories.BaseRepository;
import utn.apirest.repositories.LibroRepository;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService{

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }

    @Override
    public Page<Libro> buscarPorTitulo(String titulo, Pageable pageable) throws Exception {
        try{
            return libroRepository.findByTituloContaining(titulo, pageable);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Libro> buscarPorAutor(String filtro, Pageable pageable) throws Exception {
        try{
            return libroRepository.buscarPorAutor(filtro, pageable);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
