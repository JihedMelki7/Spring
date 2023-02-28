package tn.esprit.association.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.association.entites.DetailProduit;

public interface DetailProduitRepository extends JpaRepository<DetailProduit,Long> {
}
