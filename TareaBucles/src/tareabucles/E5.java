/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareabucles;

import java.util.Scanner;

public class E5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean condicion = true;

        double suma = 0;
        double sumaPositivos = 0;
        double sumaNegativos = 0;
        double contador = 0;
        double media;
        int mayor = -9999999;
        int menor = 10000000;
        while (condicion) {
            System.out.println("Ingrese un valor");
            int valores = sc.nextInt();
            // mayor
            if (valores == -1) {
                condicion = false;
            } else if (valores >= menor) {
                mayor = valores;
            }
            // menor
            if (valores == -1) {
                condicion = false;
            } else if (valores <= menor) {
                menor = valores;
            }
            // suma todos los numeros
            if (valores < -1 || valores > -1) {
                suma = suma + valores;
            }
            // suma de todos los numeros positivos
            if (valores > 0) {
                sumaPositivos = sumaPositivos + valores;
            }
            // suma de todos los numeros negativos
            if (valores < -1) {
                sumaNegativos = sumaNegativos + valores;
            }
            // media todos los numeros
            media = suma / contador;

            if (valores == -1) {
                condicion = false;
                System.out.printf("El mayor de los numeros:%d \n" +
                        "El menor de los numeros: %d \n" +
                        "La suma de todos los numeros: %.2f\n" +
                        "La suma de todos los positivos: %.2f\n" +
                        "La suma de todos los negativos: %.2f\n" +
                        "La media de todos los numeros: %.2f\n", mayor, menor, suma, sumaPositivos, sumaNegativos,
                        media);
            }
            contador++;
        }
        sc.close();
    }
}
