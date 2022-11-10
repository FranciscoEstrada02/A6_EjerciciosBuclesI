/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareabucles;

import java.util.Scanner;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class E3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean condicion = true;
        while (condicion) {
            System.out.println("Introduzca el primer un valor");
            int valor1 = sc.nextInt();
            System.out.println("Introduzca el segundo valor");
            int valor2 = sc.nextInt();

            if (valor1 == -1 || valor2 == -1) {
                System.out.println("Proceso terminado");
                condicion = false;
            } else {
                if (valor1 > valor2) {
                    System.out.println("El primer valor debe ser mayor");
                } else {
                    for (int i = valor1; i <= valor2; i++) {
                        System.out.println(i);
                    }
                }
            }
        }
        sc.close();
    }
}
