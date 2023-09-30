package tn.esprit.springproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "DetailFacture")
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "idDetailFacture")
    private long idDetailFacture;
    @Column(name = "qte")
    private int qte;
    @Column(name = "prixTotal")
    private float prixTotal;
    @Column(name = "pourcentageRemise")
    private int pourcentageRemise;
    @Column(name = "montantRemise")
    private float montantRemise;



@ManyToOne
    private Facture facture;
@ManyToOne
    private Produit produit;
}
