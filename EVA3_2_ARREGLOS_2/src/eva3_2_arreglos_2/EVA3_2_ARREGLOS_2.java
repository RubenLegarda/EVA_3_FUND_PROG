/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_arreglos_2;

/**
 *
 * @author invitado
 */
public class EVA3_2_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JAVA: 0 primer elemento
        //  N - 1 últmo elemento
        //N --> TOTAL DE ELEMENTOS ALMACENADOS EN EL ARREGLO
        
        //vamos a crear un arreglo y llenarlo de valores aleatorios
        // int datos[], x, y; --> SOLO datos ES UN ARREGLO
        // int[] datos, x, y; --> TODAS LAS VARIABLES SON ARREGLOS
        int datos[] = new int [20];
        
        //asignar valores aleatorios entre 0 y 99
        for(int i = 0; i < datos.length; i++){
            datos[i] = (int)(Math.random() * 100);//0 - 99
            
        }
        //imprimir los elementos del arreglo:
        for(int i = 0; i < datos.length; i++){
            System.out.print("[" + datos[i] + "]");
        }

    }
    
}
