/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

/**
 *
 * @author Mohamed
 */
public class Personeel {
    private String account;
    private String paswoord;
    private String functie;
    private String naam;
    private String voornaam;
    private String gsm;
    private String email;
    private int personeelID;

    public Personeel(int personeelID, String account, String paswoord, String naam, String voornaam, String functie, String gsm, String email) {
        this.account = account;
        this.paswoord = paswoord;
        this.naam = naam;
        this.voornaam = voornaam;
        this.functie = functie;
        this.gsm = gsm;
        this.email = email;
        this.personeelID = personeelID;
    }

    public Personeel() {
        
    }
    
    


    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return the paswoord
     */
    public String getPaswoord() {
        return paswoord;
    }

    /**
     * @param paswoord the paswoord to set
     */
    public void setPaswoord(String paswoord) {
        this.paswoord = paswoord;
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @param naam the naam to set
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * @return the voornaam
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     * @param voornaam the voornaam to set
     */
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    /**
     * @return the functie
     */
    public String getFunctie() {
        return functie;
    }

    /**
     * @param functie the functie to set
     */
    public void setFunctie(String functie) {
        this.functie = functie;
    }
    
    

    /**
     * @return the personeelID
     */
    public int getPersoneelID() {
        return personeelID;
    }

    /**
     * @param personeelID the personeelID to set
     */
    public void setPersoneelID(int personeelID) {
        this.personeelID = personeelID;
    }

    /**
     * @return the gsm
     */
    public String getGsm() {
        return gsm;
    }

    /**
     * @param gsm the gsm to set
     */
    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
    
    
}
