package tn.esprit.association.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.association.entites.Client;
import tn.esprit.association.entites.Produit;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
