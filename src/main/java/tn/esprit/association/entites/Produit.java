package tn.esprit.association.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Long idPorduit;
    String codeProduit;
    String libelleProduit;
    float prixUnitaire;
    @ManyToMany
    Set<Fournisseur> produit;


}
