package tn.esprit.association.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Long idClient;
    String nom;
    String prenom;
    @Temporal(TemporalType.DATE)
    Date dateNaissance;
    String email ;
    String password;
    @Enumerated(EnumType.STRING)
    CategorieClient categorieClient ;
    @Enumerated(EnumType.STRING)
    Profession profession;


}
