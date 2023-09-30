package tn.esprit.springproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

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

    @OneToMany (cascade = CascadeType.ALL,mappedBy = "Rayon")
    private Set<Produit> produits;
}
