/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.Services;

import BO.Film;
import DAL.DaFilm;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class FilmServices {
    private final DaFilm da = new DaFilm();
    
    public List<Film> getAllFilms(){
        return da.GetAll(true);
    }
    
    
}
