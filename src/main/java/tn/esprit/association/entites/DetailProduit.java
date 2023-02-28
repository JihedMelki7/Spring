package tn.esprit.association.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class DetailProduit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Long idDetailProduit;
    @Temporal(TemporalType.DATE)
    Date dateCreation;
    @Temporal(TemporalType.DATE)
    Date dateDerniereModification;
    @Enumerated(EnumType.STRING)
    CategorieProduit categorieProduit;

}
