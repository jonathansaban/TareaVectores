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
public class OrdenamientoInterseccion {
    
        public void ordenamientoInsercion(Libros[] l) {
        
        
        for (int siguiente = 1; siguiente < l.length; siguiente++) {
            
          
            int insercion = l[siguiente].getIsbn();
           
            int moverElemento = siguiente;
            
           
            while (moverElemento > 0 && l[moverElemento - 1].getIsbn() > insercion) {
            
           
                l[moverElemento] = l[moverElemento - 1];
                moverElemento--;
            }
            
       
            l[moverElemento].setIsbn(insercion);
          
                 imprimirIteracion(l, siguiente, moverElemento);
        }
    }
    private void imprimirIteracion(Libros[] l, int iteracion, int indice) {
        
        System.out.printf("despues de iteración %2d: ", iteracion);
        
       
        for (int i = 0; i < indice; i++) {
            System.out.printf("%d ", l[i].getIsbn());
        }
        

        System.out.printf("%d* ", l[indice].getIsbn());
        

        for (int i = indice + 1; i < l.length; i++) {
            System.out.printf("%d ", l[i].getIsbn());
        }
        
        System.out.printf("%n ");
        

        for (int i = 0; i <= iteracion; i++) {
            System.out.printf("-- ");
        }
        System.out.println();
    }
    
}
