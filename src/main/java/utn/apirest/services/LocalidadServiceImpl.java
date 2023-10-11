package utn.apirest.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.apirest.entities.Localidad;
import utn.apirest.repositories.BaseRepository;
import utn.apirest.repositories.LocalidadRepository;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}
