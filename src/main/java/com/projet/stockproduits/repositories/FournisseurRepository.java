package com.projet.stockproduits.repositories;

import com.projet.stockproduits.domaines.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public class FournisseurRepository {

    public interface Fournisseur_Repository extends JpaRepository<Fournisseur, Long>{
        
    }
}
