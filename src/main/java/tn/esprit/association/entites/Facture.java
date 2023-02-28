package tn.esprit.association.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Long idFacture;
    float montantRemise;
    float montantFacture;
    @Temporal(TemporalType.DATE)
    Date dateFacture;
    Boolean active ;


}
