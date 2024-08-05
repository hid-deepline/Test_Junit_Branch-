package com.example.gestionclients.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "client")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private String prenom;
    private String Email;
    private Integer tel;
}