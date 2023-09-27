package tn.esprit.springproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Facture")
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "idFacture")
    private long idFacture;
    @Column(name = "MontantRemise")
    private float MontantRemise;
    @Column(name = "MontantFacture")
    private float MontantFacture;
    @Column(name = "dateFacture")
    private Date dateFacture;
    @Column(name = "active")
    private Boolean active;


}
