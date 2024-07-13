package com.chrc.curso.springboot.webapp.sprigboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/* Un controlador Que pasa datos a la vista */

@Controller
public class UserController2 {

    @GetMapping("/details2")
    // Se importa el Model de springframework
    public String details2(Model model) {
        model.addAttribute("title", "Hola mundo Spring Boot. Pasando datos a la vista usando Model.");
        model.addAttribute("name", "Carlos");
        model.addAttribute("lastname", "Rueda");

        return "details2";
    }
}
