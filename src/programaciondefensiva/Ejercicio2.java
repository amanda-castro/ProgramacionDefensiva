/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciondefensiva;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author amand
 */
public class Ejercicio2 {
    public static void juego()
    {
        String[] palabras = {"Mapache","Oso","Caballo","Perro","Gato","Serpiente"};
        final int INTENTOS_TOTALES = 9;
        int intentosRealizados = 0;
        int aciertos = 0;
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        char r;
        Random rnd = new Random();
        
        do
        {
            int aa=rnd.nextInt(6);
            char[] l = letras(palabras[aa].toLowerCase());
            char[] l2 = letras(palabras[aa]);
            char[] tr = new char[l.length];
            for(int i =0; i <tr.length;i++)
            {
                tr[i] = '_';
            }
            
            System.out.println("Adivina la palabra");
            boolean ganador = false;
            while(INTENTOS_TOTALES>intentosRealizados && !ganador)
            {
                imprimeOculta(tr);
                System.out.println("\nIntroduce una letra");
                r = s.next().toLowerCase().charAt(0);
                for(int i=0;i<l.length;i++)
                {
                    if(l[i]==r)
                    {
                        tr[i] = l[i];
                        l[i] =' ';
                        aciertos++;
                    }
                }
                intentosRealizados++;
                ganador = (aciertos==tr.length);
            }
            if(ganador)
            {
                System.out.println("\nFelicidades... Ganaste");
                imprimeOculta(tr);
            }else
            {
                System.out.println("\nFracasaste... Te he vencido");
                for(intentosRealizados=0;intentosRealizados<l2.length-1;intentosRealizados++)System.out.print(l2[intentosRealizados]);
            }
            intentosRealizados=0;
            aciertos=0;
            r = pregunta("\n\nQuieres volver a jugar?", s);
        }while(r !='n');
    }
    
    private static char[] letras(String pp)
    {
        char[] l;
        l = new char[pp.length()];
        for(int i =0; i<pp.length();i++)
        {
            l[i] = pp.charAt(i);
        }
        return l;
    }
    
    private static void imprimeOculta(char[] tr)
    {
        for(int i = 0; i<tr.length;i++)
        {
            System.out.print(tr[i]+" ");
        }
    }
    
    private static char pregunta(String m, Scanner teclado)
    {
        char resp;
        System.out.println(m + "(s/n)");
        try {
                resp = teclado.next().toLowerCase().charAt(0);
            } catch (Exception e) {
                resp = ' ';
            }
        while(resp != 's' && resp != 'n')
        {
            System.out.println(m + "(s/n)");
            try {
                resp = teclado.next().toLowerCase().charAt(0);
            } catch (Exception e) {
                resp = ' ';
            }
        }
        return resp;
    }
}
