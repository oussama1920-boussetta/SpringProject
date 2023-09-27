package tn.esprit.springproject.entity;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Produit")
public class Produit implements Serializable
{@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idProduit")
private long idProduit;
    @Column(name = "code")
    private String code;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "prixUnitaire")
    private float prixUnitaire;


}
