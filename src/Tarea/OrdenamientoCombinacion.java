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
public class OrdenamientoCombinacion {
    
        public void OrdenamientoCombinacion(Libros[] l) {
        ordenarArreglo(l, 0, l.length - 1);
    }
        
        
    private void ordenarArreglo(Libros[] l, int inferior, int superior) {
        
        // evalúa el caso base; el tamaño del arreglo es igual a 1
        if ((superior - inferior) >= 1) {
            
            // calcula el elemento medio del arreglo
            int medio1 = (inferior + superior) / 2;
            // calcula el siguiente elemento arriba
            int medio2 = medio1 + 1;
            
            // imprime en pantalla la división del arreglo
            System.out.printf("division: %s%n", subarregloString(l, inferior, superior));
            System.out.printf("          %s%n", subarregloString(l, inferior, medio1));
            System.out.printf("            %s%n%n", subarregloString(l, medio2, superior));
            
            // divide el arreglo a la mitad, ordena cada mitad (invocación recursiva)
            ordenarArreglo(l, inferior, medio1);
            ordenarArreglo(l, medio2, superior);
            
            // combina dos arreglos ordenados después de que regresan las invocaciones de ordenarArreglo
            combinar(l, inferior, medio1, medio2, superior);
        }
    }
    
    
    private void combinar(Libros[] l, int izquierdo, int medio1, int medio2, int derecho) {
        
        // indice en subarreglo izquierdo
        int indiceIzquierdo = izquierdo;
        // indice en subarreglo derecho
        int indiceDerecho = medio2;
        // indice en arreglo de trabajo temporal
        int indiceCombinado = izquierdo;
        // arreglo de trabajo
        int[] combinado = new int[l.length];
        
        // imprime en pantalla los dos subarreglos antes de combinarlos
        System.out.printf("combinacion: %s%n", subarregloString(l, izquierdo, medio1));
        System.out.printf("             %s%n", subarregloString(l, medio2, derecho));
        
        // combina los arreglos hasta llegar al final de uno de ellos
        while (indiceIzquierdo <= medio1 && indiceDerecho <= derecho) {
            // coloca el menot de dos elementos actuales en el resultado y lo mueve al siguiente espacio en los arreglos
            if (l[indiceIzquierdo].getIsbn() <= l[indiceDerecho].getIsbn()) {
                combinado[indiceCombinado++] = l[indiceIzquierdo++].getIsbn();
            }
            else {
                combinado[indiceCombinado++] = l[indiceDerecho++].getIsbn();
            }
        }
        
        // si el arreglo izquierdo está vacío
        if (indiceIzquierdo == medio2) {
            // copia el resto del arreglo derecho
            while (indiceDerecho <= derecho) {
                combinado[indiceCombinado++] = l[indiceDerecho++].getIsbn();
            }
        }
        else {
            while (indiceIzquierdo <= medio1) {
                combinado[indiceCombinado++] = l[indiceIzquierdo++].getIsbn();
            }
        }
        
        // copia los valores de vuelta al arreglo original
        for (int i = izquierdo; i <= derecho; i++) {
            l[i].setIsbn(combinado[i]) ;
        }
        
        // imprime en pantalla el arreglo combinado
        System.out.printf("  %s%n%n", subarregloString(l, izquierdo, derecho));
    }
    
    
    private String subarregloString(Libros[] l, int inferior, int superior) {

        StringBuilder temporal = new StringBuilder();
        
        for (int i = 0; i < inferior; i++) {
            temporal.append("  ");
        }
        
        // imprime en pantalla el resto de los elementos del arreglo
        for (int i = inferior; i <= superior; i++) {
            temporal.append(" " + l[i]);
        }
        
        return temporal.toString();
    }
    
}
