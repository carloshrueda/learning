package com.chrc.curso.springboot.webapp.sprigboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/* Un controlador con Hola Mundo */

@Controller
public class UserController {

    @GetMapping("/details")
    public String details() {

        return "details";
    }
}
