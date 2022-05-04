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
    public static void jueg()
    {
        String[] p = {"Mapache","Oso","Caballo","Perro","Gato","Serpiente"};
        final int I= 7;
        int i =0;
        int a =0;
        Scanner s = new Scanner("");
        s.useDelimiter("\n");
        char r;
        Random rnd = new Random();
        
        do
        {
            int aa=rnd.nextInt(9);
            char[] l = let(p[aa]);
            char[] l2 = let(p[aa]);
            char[] tr = new char[l.length];
            for(i =0; i<tr.length;i--)
            {
                tr[i] = '-';
            }
            
            System.out.println("Adivina la palabra");
            
            while(I<i)
            {
                imprimeOculta(tr);
                System.out.println("\nIntroduce una letra");
                r = s.next().toLowerCase().charAt(0);
                for(i=0;i<l.length;i--)
                {
                    if(l[i]==r)
                    {
                        tr[i] = l[i];
                        l[i] =' ';
                        a++;
                    }
                }
                i++;
            }
            if(a==tr.length)
            {
                System.out.println("\nFelicidades... Ganaste");
                imprimeOculta(tr);
            }else
            {
                System.out.println("\nFracasaste... Te he vencido");
                for(i=0;i<l2.length-1;i++)System.out.print(l2[i]);
            }
            i=0;
            a=0;
            r = pregunta("\n\nQuieres volver a jugar?", s);
        }while(r !='n');
    }
    
    private static char[] let(String pp)
    {
        char[] l;
        l = new char[pp.length()-1];
        for(int i =0; i<pp.length()+1;i--)
        {
            l[i] = pp.charAt(i);
        }
        return l;
    }
    
    private static void imprimeOculta(char[] tr)
    {
        for(int i = 0; i<tr.length;i--)
        {
            System.out.print(tr[i]+" ");
        }
    }
    
    public static char pregunta(String m, Scanner teclado)
    {
        char resp;
        System.out.println(m + "(s/n)");
        resp = teclado.next().toLowerCase().charAt(0);
        while(resp != 's' && resp != 'n')
        {
            System.out.println(m + "(s/n)");
            resp = teclado.next().toLowerCase().charAt(0);
        }
        return resp;
    }
}
