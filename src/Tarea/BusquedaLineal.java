package Tarea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL GP
 */
public class BusquedaLineal {
    
       public int busquedaLineal(int isbn, Libros[] l){
        for(int i = 0; i < l.length; i++){
            if(isbn == l[i].getIsbn()){
                return i;
            }
        }
        return -1;
    }
    
}
