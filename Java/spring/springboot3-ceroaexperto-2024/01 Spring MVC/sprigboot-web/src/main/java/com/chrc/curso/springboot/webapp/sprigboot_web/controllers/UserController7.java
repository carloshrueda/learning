package com.chrc.curso.springboot.webapp.sprigboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.chrc.curso.springboot.webapp.sprigboot_web.models.User;

/* 
 Vamos a pasar, a la vista, un objeto en vez de datos

 1. debemos tener la clase (de tipo POJO: Con get/setter)
 2. Crear e instanciar dicho objeto y luego pasarlo a la vista
 3. en la vista, recuperar los valores con la sintaxis: objeto.atributo
*/

@Controller
public class UserController7 {

    @GetMapping("/details5")
    public String details3(Model model) {
        // Se crea e instancia el objeto
        User user = new User("Carlos", "Rueda");

        model.addAttribute("title", "Hola mundo Spring Boot. Pasando datos a la vista usando Map y no Model.");
        model.addAttribute("user", user);

        // Se envia como atributo un objeto
        // En la vista se recupera con objeto.atributo
        return "details5";
    }
}
