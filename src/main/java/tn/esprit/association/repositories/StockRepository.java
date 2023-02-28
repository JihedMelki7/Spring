package tn.esprit.association.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.association.entites.Stock;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
