package tn.esprit.springproject.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;


    @Entity
    public class DetailProduit implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY )
        @Column(name = "idDetailProduit")
        private long idDetailProduit;
        @Column(name = "dateCreation")
        private Date dateCreation;
        @Column(name = "dateDerniereModification")
        private String dateDerniereModification;
        public enum categorieProduit{
            Electromenager,Quincaillerie,Alimentaire
        }
    }

