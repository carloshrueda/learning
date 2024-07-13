package com.chrc.curso.springboot.webapp.sprigboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/* Un controlador Que pasa datos a la vista 
 * Aquí se usara Map en vez de Model
*/

@Controller
public class UserController3 {

    @GetMapping("/details3")
    // Se importa el Model de springframework
    public String details3(Map<String, Object> model) {
        model.put("name", "Carlos");
        model.put("lastname", "Rueda");
        model.put("title", "Hola mundo Spring Boot. Pasando datos a la vista usando Map y no Model.");

        return "details3";
    }
}
