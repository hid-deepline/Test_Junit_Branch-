


package com.example.gestionclients.service;

import com.example.gestionclients.model.Adresse;
import com.example.gestionclients.repository.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdresseService {
    @Autowired
    private AdresseRepository repository;

    public Adresse save(Adresse adresses) {

        return this.repository.save(adresses);
    }
}
