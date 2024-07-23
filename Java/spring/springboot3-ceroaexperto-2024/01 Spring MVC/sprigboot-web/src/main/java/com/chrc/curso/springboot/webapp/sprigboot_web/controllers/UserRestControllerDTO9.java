package com.chrc.curso.springboot.webapp.sprigboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chrc.curso.springboot.webapp.sprigboot_web.models.User;
import com.chrc.curso.springboot.webapp.sprigboot_web.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;

/* 
implmentación usando RestController con:
1. Mapping
2. DTO
*/

@RestController
@RequestMapping("/api") // esta será la ruta para este endpoint
public class UserRestControllerDTO9 {

    // Implementación usando dto
    @GetMapping("/details-dto")
    public UserDto detailsDto() {
        // Funcoión que implementa DTO
        User user = new User("Carlos", "Rueda");

        // Implementación objeto DTO
        UserDto userDto = new UserDto();
        userDto.setTitle("Hola mundo Spring Boot. Pasando datos a la vista usando Map y no Model.");
        userDto.setUser(user);

        return userDto;
    }

    // Implementacion usando Mapping
    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {

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
