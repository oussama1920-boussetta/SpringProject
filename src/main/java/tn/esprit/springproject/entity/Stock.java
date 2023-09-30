package tn.esprit.springproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "stock")

public class Stock implements Serializable
{
@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
@Column(name = "idStock")
    private long idStock;
    @Column(name = "qte")
private int qte;
    @Column(name = "qteMin")
    private int qteMin;
    @Column(name = "libelleStock")
    private String libelleStock;




    @OneToMany (cascade = CascadeType.ALL,mappedBy = "stock")
    private Set<Produit> produits;
}
