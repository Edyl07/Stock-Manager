package com.projet.stockproduits.repositories;

import com.projet.stockproduits.domaines.SCategorie;
import org.springframework.data.jpa.repository.JpaRepository;

public class SCategoryRepository {

    public interface SCategorie_Repository extends JpaRepository<SCategorie, Long>{

    }
}
