package tn.esprit.springproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Rayon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "idRayon")
    private long idRayon;
    @Column(name = "code")
    private String code;
    @Column(name = "libelle")
    private String libelle;
}
