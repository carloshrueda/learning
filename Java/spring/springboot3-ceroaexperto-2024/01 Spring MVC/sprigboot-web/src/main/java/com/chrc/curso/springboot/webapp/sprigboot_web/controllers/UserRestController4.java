package com.chrc.curso.springboot.webapp.sprigboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* 
Se construye un RestController para devolver datos en formato
JSON
*/

@RestController
public class UserRestController4 {

    @GetMapping("/details4")
    // Se importa el Model de springframework
    public Map<String, Object> details4() {
        Map<String, Object> body = new HashMap<>();

        body.put("lastname", "Rueda");
        body.put("name", "Carlos");
        body.put("title", "Hola mundo Spring Boot. Pasando datos a la vista usando Map y no Model.");

        // se devuelve un Mapa ya que el JSON tiene una estructura similar
        return body;
    }
}
