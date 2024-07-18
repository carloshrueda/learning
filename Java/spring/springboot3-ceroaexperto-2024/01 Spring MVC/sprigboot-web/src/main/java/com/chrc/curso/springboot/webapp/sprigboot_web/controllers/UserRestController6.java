package com.chrc.curso.springboot.webapp.sprigboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/* 
Se construye un RestController para devolver datos en formato
JSON.

Vamos a mezclar Controler con RestController

*/

// aqui va el controler
@Controller
@RequestMapping("/api") // esta será la ruta para este endpoint
public class UserRestController6 {

    @GetMapping("/details2")
    // Se agregar la anotación @ResponseBody para devolver un JSON
    @ResponseBody
    // Se importa el Model de springframework
    public Map<String, Object> details6() {
        Map<String, Object> body = new HashMap<>();

        body.put("lastname", "Rueda");
        body.put("name", "Carlos");
        body.put("title", "Hola mundo Spring Boot. Pasando datos a la vista usando Map y no Model.");

        // se devuelve un Mapa ya que el JSON tiene una estructura similar
        return body;
    }
}
