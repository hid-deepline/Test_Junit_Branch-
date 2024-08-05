package com.example.gestionclients.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "adresse")
@Data

public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String adresse;
    @Column(columnDefinition = "TEXT")
    private String ville;
    private Integer codePostal;

    @ManyToOne
    private Client client;
}