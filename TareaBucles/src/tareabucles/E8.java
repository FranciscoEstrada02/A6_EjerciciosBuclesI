package tareabucles;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author festr
 */
public class E8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abajo = "abajo";
        String arriba = "arriba";
        String izquierda = "izquierda";
        String derecha = "derecha";
        int menor = -999999;
        int mayor = 10000000;

        System.out.println("Ingrese su posicion inicial en el eje X");
        int ejeX = sc.nextInt();
        System.out.println("Ingrese su posicia inical en el eje Y");
        int ejeY = sc.nextInt();

        // Limpieza buffer
        sc.nextLine();

        boolean condicion1 = true;
        boolean condicion2 = true;

        while (condicion1) {
            System.out.println("Ingrese hacia donde quiere mover su personaje");
            String direccion = sc.nextLine();
            // Limpieza buffer
            sc.nextLine();
            System.out.println("Ingrese cuantas posiciones desea moverse");
            int posiciones = sc.nextInt();

            if (direccion.equals(abajo)) {
                //int ejeYFinal = ejeY - posiciones;
                while (condicion2) {
                    System.out.printf("El personaje se mueve a la posición x = %d, y = %d\n", ejeX, ejeY);
                    ejeY--;

                    if (ejeY < mayor) {
                        condicion2 = false;
                    }
                }
            }
            if (direccion.equals(arriba)) {
                int ejeYFinal = ejeY + posiciones;
                while (condicion2) {
                    System.out.printf("El personaje se mueve a la posición x = %d, y = %d\n", ejeX, ejeY);
                    ejeY++;

                    if (ejeY > ejeYFinal) {
                        condicion2 = false;
                    }
                }
            }
            if (direccion.equals(izquierda)) {
                int ejeXFinal = ejeX - posiciones;
                while (condicion2) {
                    System.out.printf("El personaje se mueve a la posición x = %d, y = %d\n", ejeX, ejeY);
                    ejeY--;

                    if (ejeX < ejeXFinal) {
                        condicion2 = false;
                    }
                }
            }
            if (direccion.equals(derecha)) {
                int ejeXFinal = ejeX + posiciones;
                while (condicion2) {
                    System.out.printf("El personaje se mueve a la posición x = %d, y = %d\n", ejeX, ejeY);
                    ejeY--;

                    if (ejeX  > ejeXFinal) {
                        condicion2 = false;
                    }
                }
            }

        }
        sc.close();
    }
}
