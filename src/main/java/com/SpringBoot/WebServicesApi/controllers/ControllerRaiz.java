package com.SpringBoot.WebServicesApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ControllerRaiz {
	
	
	
@GetMapping(path = "/")
public String BemVindo() {
	return "Bem Vindo a WebServices para ultilizar Este WebServices Favor Acessar o http://localhost:8080/api/produtos para consultar ";
}

}
