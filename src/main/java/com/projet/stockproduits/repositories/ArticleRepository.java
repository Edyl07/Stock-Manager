package com.projet.stockproduits.repositories;
//import java.util.Optional;

import com.projet.stockproduits.domaines.Article;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

public class ArticleRepository {

    public interface Article_Repository extends JpaRepository<Article, Long>{

    }
}
