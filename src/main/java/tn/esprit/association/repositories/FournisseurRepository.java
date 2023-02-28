package tn.esprit.association.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.association.entites.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {
}
