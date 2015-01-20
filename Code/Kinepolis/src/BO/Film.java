/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.sql.Blob;
import java.util.Calendar;

/**
 *
 * @author Mohamed
 */
public class Film {
    private int filmID;
    private String titel;
    private String genre;
    private String acteur;
    private String regisseur;
    private Calendar uitgifteJaar;
    private double score;
    private Blob foto;
    private String drieDimensie;

    @Override
    public String toString() {
        return "Film{" + "Titel=" + getTitel() + ", Genre=" + getGenre() + ", Acteur=" + getActeur() + ", Released=" + getUitgifteJaar() + ", Score=" + getScore() + ", 3D=" + getDrieDimensie() + '}';
    }
    
    

    public Film(int filmID, String titel, String genre, String acteur, String regisseur, Calendar uitgifteJaar, double score, Blob foto, String drieDimensie) {
        this.filmID = filmID;
        this.titel = titel;
        this.genre = genre;
        this.acteur = acteur;
        this.regisseur = regisseur;
        this.uitgifteJaar = uitgifteJaar;
        this.score = score;
        this.foto = foto;
        this.drieDimensie = drieDimensie;
    }

    public Film() {
        filmID = 0;
    }

    /**
     * @return the filmID
     */
    public int getFilmID() {
        return filmID;
    }

    /**
     * @return the titel
     */
    public String getTitel() {
        return titel;
    }

    /**
     * @param titel the titel to set
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the acteur
     */
    public String getActeur() {
        return acteur;
    }

    /**
     * @param acteur the acteur to set
     */
    public void setActeur(String acteur) {
        this.acteur = acteur;
    }

    /**
     * @return the regisseur
     */
    public String getRegisseur() {
        return regisseur;
    }

    /**
     * @param regisseur the regisseur to set
     */
    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }

    /**
     * @return the uitgifteJaar
     */
    public Calendar getUitgifteJaar() {
        return uitgifteJaar;
    }

    /**
     * @param uitgifteJaar the uitgifteJaar to set
     */
    public void setUitgifteJaar(Calendar uitgifteJaar) {
        this.uitgifteJaar = uitgifteJaar;
    }

    /**
     * @return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * @return the foto
     */
    public Blob getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    /**
     * @return the drieDimensie
     */
    public String getDrieDimensie() {
        return drieDimensie;
    }

    /**
     * @param drieDimensie the drieDimensie to set
     */
    public void setDrieDimensie(String drieDimensie) {
        this.drieDimensie = drieDimensie;
    }
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
}
