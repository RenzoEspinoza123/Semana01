
package com.mycompany.semana01;

import java.util.Scanner;
//Programa que solicita ingresar un número favorito por teclado y luego el computador debe mostrar el mensaje “Tu numero favorito es <numero ingresado>”.
public class E11 {

    public static void main(String[] args) {
        float num;
        Scanner Teclado =new Scanner (System.in);
        
        System.out.println("Ingrese su numero favorito");
        num=Teclado.nextFloat();
        System.out.println("Su numero favorito es: "+ num);
    }
}
