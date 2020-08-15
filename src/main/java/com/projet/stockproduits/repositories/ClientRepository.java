package com.projet.stockproduits.repositories;

import com.projet.stockproduits.domaines.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public class ClientRepository {

    public interface Client_Repository extends JpaRepository<Client, Long>{

    }
}
