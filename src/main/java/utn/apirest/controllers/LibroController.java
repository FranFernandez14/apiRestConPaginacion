package utn.apirest.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utn.apirest.entities.Libro;
import utn.apirest.services.LibroServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {


    @GetMapping("/buscarPorTitulo")
    public ResponseEntity<?> buscarPorTitulo(@RequestParam String titulo, Pageable pageable){
    try {
        return ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorTitulo(titulo, pageable));
    }catch (Exception e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
    }
    }
    @GetMapping("/buscarPorAutor")
    public ResponseEntity<?> buscarPorAutor(@RequestParam String filtro, Pageable pageable){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorAutor(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

}
