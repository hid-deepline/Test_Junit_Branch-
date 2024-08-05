package com.example.gestionclients.controller;


import com.example.gestionclients.model.Adresse;
import com.example.gestionclients.service.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdresseController {

    @Autowired
    private AdresseService adresseService;

    @GetMapping("/adresse")
    public String index() {
        return "adresse/adresses";
    }
    @PostMapping("/adresse")
    public String formAdresses(@ModelAttribute Adresse adresses) {

        this.adresseService.save(adresses);

        return "redirect:/client";

    }

}
