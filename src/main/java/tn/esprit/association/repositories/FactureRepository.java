package tn.esprit.association.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.association.entites.Facture;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
