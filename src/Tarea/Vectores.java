/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

/**
 *
 * @author DELL GP
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libros[] l = new Libros[5];
        
        l[0] = new Libros(366655);
        l[1] = new Libros(855214);
        l[2] = new Libros(852641);
        l[3] = new Libros(885511);
        l[4] = new Libros(987456);
        
        OrdenamientoSeleccion Orselec = new OrdenamientoSeleccion();
        Orselec.OrdenamientoSeleccion(l);
    }
    
}

    

