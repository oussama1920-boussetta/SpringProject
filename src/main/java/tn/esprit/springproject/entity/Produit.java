package tn.esprit.springproject.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

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

    @OneToOne
    private DetailProduit detailProduit;

    @ManyToOne
    private Stock stock;

@OneToMany (cascade = CascadeType.ALL ,mappedBy = "produit")
    private Set<DetailFacture> detailFactures;

@ManyToOne
    private Rayon rayon;
@ManyToMany (cascade = CascadeType.ALL,mappedBy = "Produit")
    private Set<Fournisseur> fournisseurs;

}
