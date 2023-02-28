package tn.esprit.association.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.association.entites.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
