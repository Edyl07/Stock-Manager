package com.projet.stockproduits.domaines;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;
    private String libelle;
    private String contact;
    private String adresse;
    private String tel;
    private String matFisc;
    private String asujet;
    private String timbre;
    private float soldeInit;
    private float solde;
    private String login;
    private String password;

    public Client(long id, String code, String libelle, String contact, String adresse, String tel, String matFisc, String asujet, String timbre, float soldeInit, float solde, String login, String password) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
        this.contact = contact;
        this.adresse = adresse;
        this.tel = tel;
        this.matFisc = matFisc;
        this.asujet = asujet;
        this.timbre = timbre;
        this.soldeInit = soldeInit;
        this.solde = solde;
        this.login = login;
        this.password = password;
    }

    public Client() {
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMatFisc() {
        return matFisc;
    }

    public void setMatFisc(String matFisc) {
        this.matFisc = matFisc;
    }

    public String getAsujet() {
        return asujet;
    }

    public void setAsujet(String asujet) {
        this.asujet = asujet;
    }

    public String getTimbre() {
        return timbre;
    }

    public void setTimbre(String timbre) {
        this.timbre = timbre;
    }

    public float getSoldeInit() {
        return soldeInit;
    }

    public void setSoldeInit(float soldeInit) {
        this.soldeInit = soldeInit;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", contact='" + contact + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                ", matFisc='" + matFisc + '\'' +
                ", asujet='" + asujet + '\'' +
                ", timbre='" + timbre + '\'' +
                ", soldeInit=" + soldeInit +
                ", solde=" + solde +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
