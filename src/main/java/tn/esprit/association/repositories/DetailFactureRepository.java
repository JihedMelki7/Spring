package tn.esprit.association.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.association.entites.DetailFacture;

public interface DetailFactureRepository extends JpaRepository<DetailFacture,Long> {
}
