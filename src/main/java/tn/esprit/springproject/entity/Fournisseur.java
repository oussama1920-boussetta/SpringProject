package tn.esprit.springproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Fournisseur")
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idDetailProduit")
    private Long idFournisseur;
    @Column(name = "code")
    private String code;
    @Column(name = "libelle")
    private String libelle;
}
