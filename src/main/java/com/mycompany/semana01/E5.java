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
public class E5 {
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5, suma;
        double promedio;
        Scanner Teclado =new Scanner (System.in);
        System.out.println ("Inserte la nota 1");
        n1=Teclado.nextInt();
        System.out.println ("Inserte la nota 2");
        n2=Teclado.nextInt();
        System.out.println ("Inserte la nota 3");
        n3=Teclado.nextInt();
        System.out.println ("Inserte la nota 4");
        n4=Teclado.nextInt();
        System.out.println ("Inserte la nota 5");
        n5=Teclado.nextInt();
        
        suma = n1+n2+n3+n4+n5;
        promedio = suma/5;
        
        System.out.println ("La suma es: " + promedio);
    }
}
