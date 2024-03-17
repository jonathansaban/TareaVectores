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
public class OrdenamientoSeleccion {
    
        public void OrdenamientoSeleccion(Libros[] l) {
        
        // itera a través de datos.length - 1 elementos
        for (int i = 0; i < l.length - 1; i++) {
            int datoMenor = i; // primer índice del resto del arreglo
            
            // se itera para buscar el índice del elementos más pequeño
            for (int indice = i + 1; indice < l.length; indice++) {
                if (l[indice].getIsbn() < l[datoMenor].getIsbn()) {
                    datoMenor = indice;        
                }
            }    
            
            intercambiar(l, i, datoMenor);
            
            imprimirIteracion2(l, i + 1, datoMenor);
        }
    }
        
        
    private void intercambiar(Libros[] l, int primero, int segundo) {
        
        int temporal = l[primero].getIsbn();
        l[primero] = l[segundo];
        l[segundo].setIsbn(temporal);
    }
    
    
    private void imprimirIteracion2(Libros[] l, int iteracion, int indice) {
        
        System.out.printf("después de iteracion %2d: ", iteracion);
        
        // imprime elementos hasta el elemento seleccionado
        for (int i = 0; i < indice; i++) {
            System.out.printf("%d ", l[i].getIsbn());
        }
        
        // indica intercambio
        System.out.printf("%d* ", l[indice].getIsbn());
        
        // termina de imprimir el arreglo en pantalla
        for (int i = indice + 1; i < l.length; i++) {
            System.out.printf("%d ", l[i].getIsbn());
        }
        
        System.out.printf("%n ");
        
        // indica la cnatidad del arreglo que está ordenada
        for (int j = 0; j < iteracion; j++) {
            System.out.print("-- ");
        }
        
        System.out.println();
    }
    
}
