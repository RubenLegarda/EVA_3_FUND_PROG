/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_9_arreglos;

/**
 *
 * @author invitado
 */
public class EVA_9_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemana[] = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        char vocales[] = {'a','e','i','o','u'};
        System.out.println("Tamalo del arreglo diasSemana = " + diasSemana.length);
        System.out.println("Tamalo del arreglo vocales = " + vocales.length);
                
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i]);
            
        }
        for (int i = 0; i < vocales.length; i++) {
            System.out.println(vocales[i]);
            
        }
        System.out.println("");
        String menu[] = {"Archivo","Nueva Factura","Modificar","Salir"};
                for(int i = 0; i < menu.length; i++){
                    System.out.println(i + " - " + menu[i]);
                }
                
        }
    }
