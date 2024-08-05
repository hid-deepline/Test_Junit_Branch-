



package com.example.gestionclients.service;


import com.example.gestionclients.model.Client;
import com.example.gestionclients.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public Client save(Client clients) {

        return this.repository.save(clients);
    }


}
