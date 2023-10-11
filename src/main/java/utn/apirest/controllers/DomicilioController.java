package utn.apirest.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utn.apirest.entities.Domicilio;
import utn.apirest.services.DomicilioServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {
}
