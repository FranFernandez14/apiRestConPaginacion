package utn.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import utn.apirest.entities.Persona;
import utn.apirest.repositories.BaseRepository;
import utn.apirest.repositories.PersonaRepository;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long>  implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    @Override
    public Page<Persona> buscarPorNombre(String nombre, Pageable pageable) throws Exception {
        try{
            return personaRepository.buscarPorNombre(nombre, pageable);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
