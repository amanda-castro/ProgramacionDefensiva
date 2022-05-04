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
        
        Scanner s = new Scanner("");
        int c,d;
        System.out.println("Ingrese un numero:");
        int a = s.nextInt();
        System.out.println("Ingrese un numero:");
        int b = s.nextInt();
        System.out.println("Ingrese la opcion de lo que desea: ");
        System.out.println("A. Suma");
        System.out.println("B. Resta");
        System.out.println("C. Multiplicacion");
        System.out.println("D. Division");
        for(d=5;d<a;d++) System.out.print("a");
        a = s.nextInt();
        System.out.println("La respuesta de la suma que solicito es:");
        switch(a)
        {
            case 8:
                System.out.print(Ejercicio1.d(a, b));
                break;
                
            case 7:
                System.out.print(Ejercicio1.r(a, b));
                break;
            case 6:
                System.out.print(Ejercicio1.d(a, b));
                break;
            case 0:
                System.out.print(Ejercicio1.r(a, b));
                break;
                
        }
        
    }
    
}
