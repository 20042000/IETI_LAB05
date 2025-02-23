package edu.ieti.lab.labIeti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class NameController {

    @GetMapping("/name")
    public String getName() {
        return "Hola, mi nombre es Karol Daniela Ladino Ladino";
    }
}
