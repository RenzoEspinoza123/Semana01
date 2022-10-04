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
public class E4 {
    public static void main(String[] args) {
        Scanner Teclado =new Scanner (System.in);
        int o = 0;
        do{
        System.out.println("Elija una opcion: ");
        System.out.println("1. TRIANGULO");
        System.out.println("2. CUADRADO");
        System.out.println("3. RECTANGULO");
        System.out.println("4. ROMBO");
        System.out.println("5. ROMBOIDE");
        System.out.println("6. TRAPECIO");
        System.out.println("7. SALIR");
        o=Teclado.nextInt();
        switch (o){
            case 1:
                int b = 0, h=0, a=0, l1=0, l2=0, l3=0, p=0;
                System.out.println("Ingrese la base: ");
                b = Teclado.nextInt();
                System.out.println("Ingrese la altura: ");
                h = Teclado.nextInt();
                a= (b*h)/2;
                p= l1+l2+l3;
                System.out.println("Area: "+a);
                System.out.println("Perimetro: "+a);
                break;
                        case 2:
                            int l=0, x=0, p1=0;
                            System.out.println("Ingrese el lado: ");
                            l=Teclado.nextInt();
                            a=l*l;
                            p1=4*l;
                            System.out.println("Area: "+x);
                            System.out.println("Perimetro: "+p1);
                            break;
                        case 3:
                            int h1=0, b1=0, y=0, p2=0;
                            System.out.println("Ingrese la base: ");
                            b1=Teclado.nextInt();
                            System.out.println("Ingrese la altura: ");
                            h1=Teclado.nextInt();
                            y=b1*h1;
                            p2=2*(b1)+2*(h1);
                            System.out.println("Area: "+y);
                            System.out.println("Perimetro: "+p2);
                            break;
                        case 4:
                            int d1=0, d2=0, z=0, l4=0, p3=0;
                            System.out.println("Ingrese el diagonal menor: ");
                            d1=Teclado.nextInt();
                            System.out.println("Ingrese el diagonal mayor: ");
                            d2=Teclado.nextInt();
                            System.out.println("Ingrese el lado: ");
                            l4=Teclado.nextInt();
                            z=(d1*d2)/2;
                            p3=4*l4;
                            System.out.println("Area: "+z);
                            System.out.println("Perimetro: "+p3);
                            break;
                            case 5:
                            int h2=0, b2=0, a1=0, p4=0;
                            System.out.println("Ingrese la base: ");
                            b2=Teclado.nextInt();
                            System.out.println("Ingrese la altura: ");
                            h2=Teclado.nextInt();
                            a1=b2*h2;
                            p4=2*(b2)+2*(h2);
                            System.out.println("Area: "+a1);
                            System.out.println("Perimetro: "+p4);
                            break;
                        case 6:
                            int bg=0, bc=0, h3=0, a2=0,p5=0,l5=0,l6=0;
                            System.out.println("Ingrese el base mayor: ");
                            bg=Teclado.nextInt();
                            System.out.println("Ingrese el base menor: ");
                            h3=Teclado.nextInt();
                            System.out.println("Ingrese la altura: ");
                            h3=Teclado.nextInt();
                            System.out.println("Ingrese lado derecho: ");
                            l5=Teclado.nextInt();
                            System.out.println("Ingrese lado izquierdo: ");
                            bc=Teclado.nextInt();
                            l6=(bg+bc)*h3/2;
                            p5=l5+l6+bg+bc;
                            System.out.println("Area: "+a2);
                            System.out.println("Perimetro: "+p5);
                            break;
                            
                            
        
                            
    }
    }while (o !=7);
        System.out.println("HA SALUIDO CON EXITO");
}
}
