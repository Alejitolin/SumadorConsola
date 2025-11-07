package com.mycompany.sumadorconsola;

public class SumadorConsola {
    public static void main(String[] args) {

        int num1 = 50; 
        int num2 = 75;
        int resultado = num1 + num2;

        System.out.println("--- Versión 3: Output de resultado detallado ---"); // Mensaje de actualización
        
        // CAMBIO PRINCIPAL: Muestra la operación completa para mayor claridad
        System.out.println("El resultado de la suma de " + num1 + " más " + num2 + " es: " + resultado); 
    }
}