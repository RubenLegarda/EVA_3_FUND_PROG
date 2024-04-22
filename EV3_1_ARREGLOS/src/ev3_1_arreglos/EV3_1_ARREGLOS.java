/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev3_1_arreglos;

/**
 *
 * @author invitado
 */
public class EV3_1_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LOS ARREGLOS EN JAVA SON OBJETOS
        //TENEMOS QUE CREARLOS ANTES DE USARLOS
        //[] --> manejar los indices: arreglo[3] acceso a la posición
        //declaración = creación (new) [tamaño del arreglo]
        int arreglo[] = new int[10]; //un arreglo de 10 enteros
        //a tráves de índices:
        //conocer las posiciones de los valores:
        //PRIMER POSICION DE UN ARREGLO EN JAVA --> 0
        //ULTIMA POSICION DE UN ARREGLO ES --> N - 1, donde
        //N ES EL TAMAÑO DEL ARREGLO
        arreglo[1] = 100;
        System.out.println("Valor de arreglo[1] = " + arreglo[1]);
        System.out.println(arreglo);
        System.out.println(arreglo.length);//length es la cantidad de elementos 
    }
    
}
