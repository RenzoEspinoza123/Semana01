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
public class E6 {
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5, producto;
        Scanner Teclado =new Scanner (System.in);
        System.out.println ("Inserte el 1er numero");
        n1=Teclado.nextInt();
        System.out.println ("Inserte el 2do numero");
        n2=Teclado.nextInt();
        System.out.println ("Inserte el 3er numero");
        n3=Teclado.nextInt();
        System.out.println ("Inserte el 4to numero");
        n4=Teclado.nextInt();
        System.out.println ("Inserte el 5to numero");
        n5=Teclado.nextInt();
        
        producto = n1*n2*n3*n4*n5;
        
        System.out.println ("El producto es: " + producto);
    }
}
