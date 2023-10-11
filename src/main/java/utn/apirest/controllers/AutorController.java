package utn.apirest.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.apirest.entities.Autor;
import utn.apirest.services.AutorServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
