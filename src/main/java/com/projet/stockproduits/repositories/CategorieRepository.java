package com.projet.stockproduits.repositories;

import com.projet.stockproduits.domaines.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public class CategorieRepository {

    public interface Categorie_Repository extends JpaRepository<Categorie, Long>{

    }
}
