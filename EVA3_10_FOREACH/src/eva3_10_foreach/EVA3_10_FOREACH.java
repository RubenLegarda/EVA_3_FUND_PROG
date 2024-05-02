/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_foreach;

/**
 *
 * @author invitado
 */
public class EVA3_10_FOREACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemana[] = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        for (String dia : diasSemana) {
            System.out.println(dia);
        }
        int salario[] = {50, 1000, 5687, 12314, 7855, 1000000, 35789};
        for(int cant: salario){
            System.out.println("$" + cant);
        }
        //-------------
        //MESES DEL AÑO. IMPRIMIR CON FOR-EACH
        String mesesAño[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (String mes : mesesAño) {
            System.out.println(mes);
        
    }
    }
}
