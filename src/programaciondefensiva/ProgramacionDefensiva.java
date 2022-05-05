/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciondefensiva;

import java.util.Scanner;

/**
 *
 * @author amand
 */
public class ProgramacionDefensiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        Scanner s = new Scanner(System.in);
        char respuesta;
        System.out.println("Ingrese la opcion de lo que desea: ");
        System.out.println("A. Suma");
        System.out.println("B. Resta");
        System.out.println("C. Multiplicacion");
        System.out.println("D. Division");
        System.out.println("E. Salir");
        respuesta = s.next().toUpperCase().charAt(0);
        while( respuesta!='A'&&respuesta!='B'&&respuesta!='C'&&respuesta!='D'
                && respuesta!='E')
        {
            System.out.println("Ingrese la opcion de lo que desea: ");
            System.out.println("A. Suma");
            System.out.println("B. Resta");
            System.out.println("C. Multiplicacion");
            System.out.println("D. Division");
            System.out.println("E. Salir");
            respuesta = s.next().toUpperCase().charAt(0);
        }
        int a=0,b=0;
        if(respuesta!='E')
        {
            System.out.println("Ingrese un numero:");
            a = s.nextInt();
        System.out.println("Ingrese un numero:");
            b = s.nextInt();
        }
        switch(respuesta)
        {
            case 'A':
                System.out.println("La respuesta de la suma que solicito es:");
                System.out.print(Ejercicio1.suma(a, b));
                break;
                
            case 'B':
                System.out.println("La respuesta de la resta que solicito es:");
                System.out.print(Ejercicio1.resta(a, b));
                break;
            case 'C':
                System.out.println("La respuesta de la multiplicacion que solicito es:");
                System.out.print(Ejercicio1.multiplicacion(a, b));
                break;
            case 'D':
                System.out.println("La respuesta de la division que solicito es:");
                System.out.print(Ejercicio1.division(a, b));
                break;
            default:
                System.out.print("Lamento no haber sido de ayuda :(\n");
                break;
        }
        
    }
    
}
