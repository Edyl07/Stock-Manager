package com.projet.stockproduits.domaines;

import javax.persistence.*;

@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;
    private String libelle;
    private int pa;
    private int tva;
    private float pv;
    private float stockInit;
    private float stock;

    public Article(long id, String code, String libelle, int pa, int tva, float pv, float stockInit, float stock) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
        this.pa = pa;
        this.tva = tva;
        this.pv = pv;
        this.stockInit = stockInit;
        this.stock = stock;
    }

    public Article() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public int getTva() {
        return tva;
    }

    public void setTva(int tva) {
        this.tva = tva;
    }

    public float getPv() {
        return pv;
    }

    public void setPv(float pv) {
        this.pv = pv;
    }

    public float getStockInit() {
        return stockInit;
    }

    public void setStockInit(float stockInit) {
        this.stockInit = stockInit;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", pa=" + pa +
                ", tva=" + tva +
                ", pv=" + pv +
                ", stockInit=" + stockInit +
                ", stock=" + stock +
                '}';
    }
}
