package tn.esprit.springproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

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
    @ManyToMany (cascade = CascadeType.ALL,mappedBy = "Fournisseur")
    private Set<Produit> produits;
}
