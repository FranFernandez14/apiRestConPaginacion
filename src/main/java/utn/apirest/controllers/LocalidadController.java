package utn.apirest.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.apirest.entities.Localidad;
import utn.apirest.services.LocalidadServiceImpl;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{
}
