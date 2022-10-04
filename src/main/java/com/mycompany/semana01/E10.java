/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana01;

/**
 *
 * @author LENOVO
 */
public class E10 {
    public static void main(String[] args) {
        double radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8;
        double pi, suma;
        double area1, area2, area3, area4, area5, area6, area7, area8;
        
        pi = 3.14159265;
        radio1 = 18.9;
        radio2 = 16.7;
        radio3 = 71.9;
        radio4 = 4.6;
        radio5 = 6.7;
        radio6 = 5.6;
        radio7 = 4.7;
        radio8 = 10;
        area1= (pi*pi)*radio1;
        area2= (pi*pi)*radio2;
        area3= (pi*pi)*radio3;
        area4= (pi*pi)*radio4;
        area5= (pi*pi)*radio5;
        area6= (pi*pi)*radio6;
        area7= (pi*pi)*radio7;
        area8= (pi*pi)*radio8;
        suma= (area1+area2+area3+area4+area5+area6+area7+area8);
        System.out.println ("SUMA DE AREAS DE 8 CIRCULOS");
        System.out.println("=====================");
        System.out.println ("El area del circulo N°1: " + area1);
        System.out.println ("El area del circulo N°2: " + area2);
        System.out.println ("El area del circulo N°3: " + area3);
        System.out.println ("El area del circulo N°4: " + area4);
        System.out.println ("El area del circulo N°5: " + area5);
        System.out.println ("El area del circulo N°6: " + area6);
        System.out.println ("El area del circulo N°7: " + area7);
        System.out.println ("El area del circulo N°8: " + area8);
        System.out.println("=====================");
        System.out.println ("La suma de las areas es: " + suma);
        
    }
}
