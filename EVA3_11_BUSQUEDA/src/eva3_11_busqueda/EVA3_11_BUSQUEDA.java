/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_11_busqueda;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_11_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CREAR UN ARREGLO (ENTEROS):
        int valores[] = new int [10];  
        for(int i = 0; i < valores.length; i++){
                valores[i] = (int)(Math.random() * 100) + 1;
        }
        //IMPRIMIR:
        for(int cant: valores){
            System.out.print("[" + cant + "]");
        }
        //PREGUNTAR AL USUARIO EL VALOR A BUSCAR:
        Scanner captu = new Scanner(System.in);
        System.out.println("");
        System.out.println("¿Que valor buscas?");
        int valor = captu.nextInt();
        //BUSCAR:
            //RECORRER EL ARREGLO (CICLO FOR)
            //COMPARAR VALOR BUSCADO CONTRA EL VALORE EN EL ARREGLO
            //DETENERME SI LO ENCUENTRO, SI NO, SEGUIR BUSCANDO
            //REGRESAR EL RESULTADO: PUEDE VARIAR > PUEDE SER LA POSICIÓN
            //O VERDADERO (SI LO ENCUENTRA) O FALSO (NO LO ENCUENTRA)
            int pos = -1;
            for(int i = 0; i < valores.length; i++){
               pos = i + 1; //almaceno la posición donde esta el valor
                if(valor == valores[i]){
                    break;
                }
            }
            System.out.println("Posición = " + pos);
    }
    
}
