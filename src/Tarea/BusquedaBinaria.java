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
public class BusquedaBinaria {
    
        public int BusquedaBinaria(int llave, Libros[] l){
            
        int limiteInferior = 0;
        
        int limiteSuperior = l.length - 1;
        
        int medio = (limiteInferior + limiteSuperior + 1) / 2;
        
        int ubicacion = -1;
        
        do{
            
            for (int i = 0; i < medio; i++) {
                 System.out.print(" ");
             }
             
            if (llave == l[medio].getIsbn()) {
                ubicacion = medio; 
            }
            else if (llave < l[medio].getIsbn()) { 
                limiteSuperior = medio - 1; 
            }
            else { 
                limiteInferior = medio + 1;
            }
            
            medio = (limiteInferior + limiteSuperior + 1) / 2;
        }while((limiteInferior <= limiteSuperior) && (ubicacion == -1));
        return ubicacion;
    }
    
}
