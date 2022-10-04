/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana01;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class E7 {
    public static void main(String[] args) {
        float n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, suma1, suma2, producto;
        Scanner Teclado =new Scanner (System.in);
        System.out.println ("Inserte el 1er numero");
        n1=Teclado.nextFloat();
        System.out.println ("Inserte el 2do numero");
        n2=Teclado.nextFloat();
        System.out.println ("Inserte el 3er numero");
        n3=Teclado.nextFloat();
        System.out.println ("Inserte el 4to numero");
        n4=Teclado.nextFloat();
        System.out.println ("Inserte el 5to numero");
        n5=Teclado.nextFloat();
        System.out.println ("Inserte el 6to numero");
        n6=Teclado.nextFloat();
        System.out.println ("Inserte el 7mo numero");
        n7=Teclado.nextFloat();
        System.out.println ("Inserte el 8vo numero");
        n8=Teclado.nextFloat();
        System.out.println ("Inserte el 9no numero");
        n9=Teclado.nextFloat();
        System.out.println ("Inserte el 10mo numero");
        n10=Teclado.nextFloat();
        
        suma1 = n1+n2+n3+n4+n5;
        suma2 = n6+n7+n8+n9+n10;
        producto = suma1*suma2;
        
        System.out.println ("La suma de los 5 primeros numeros es: " + suma1);
        System.out.println ("La suma de los 5 ultimos numeros es: " + suma2);
        System.out.println ("El producto es: " + producto);
    }
}
