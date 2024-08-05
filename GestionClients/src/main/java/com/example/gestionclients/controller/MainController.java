package com.example.gestionclients.controller;

import com.example.gestionclients.model.Client;
import com.example.gestionclients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public String home() {

        return "index";
    }
    @GetMapping("/clients")
    public String clients() {
        return "client";
    }

}
