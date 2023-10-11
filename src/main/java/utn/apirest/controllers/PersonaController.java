package utn.apirest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utn.apirest.entities.Persona;
import utn.apirest.services.PersonaServiceImpl;

import org.springframework.data.domain.Pageable;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {


    @GetMapping("/buscar")
    public ResponseEntity<?> buscarPorNombre (@RequestParam String nombre, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorNombre(nombre, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }


    }

}
