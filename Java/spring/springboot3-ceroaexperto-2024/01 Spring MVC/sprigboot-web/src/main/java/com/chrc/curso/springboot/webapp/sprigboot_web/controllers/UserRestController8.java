package com.chrc.curso.springboot.webapp.sprigboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chrc.curso.springboot.webapp.sprigboot_web.models.User;

import org.springframework.web.bind.annotation.RequestMapping;

/* 
Se pasa a la vista un objeto
1. se instancia el objeto con los atributos que se desean pasar
2. se pasa dicho objeto
*/

@RestController
@RequestMapping("/api") // esta será la ruta para este endpoint
public class UserRestController8 {

    @GetMapping("/details3")
    public Map<String, Object> details8() {
        // 1. Se instancia el objeto con los atributo a pasar
        User user = new User("Carlos", "Rueda");

        // Se cre un map para pasar como JSON
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo Spring Boot. Pasando datos a la vista usando Map y no Model.");
        // Se pasa el objeto
        body.put("user", user);

        // se devuelve un Mapa ya que el JSON tiene una estructura similar
        return body;
    }
}
