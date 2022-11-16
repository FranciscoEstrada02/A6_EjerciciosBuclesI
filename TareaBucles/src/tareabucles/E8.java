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

        System.out.println(ejeX + ", " + ejeY);

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
<<<<<<< HEAD

                int ejeYFinal = ejeY - posiciones;
                while (condicion2) {
                    ejeY--;
                    System.out.printf("El personaje se mueve a la posición x = %d, y = %d\n", ejeX, ejeY);

=======
                int ejeYFinal = ejeY - posiciones;
                while (condicion2) {
                    System.out.printf("El personaje se mueve a la posición x = %d, y = %d\n", ejeX, ejeY);
                    

>>>>>>> 0ad569b335fcde9bc5839071fc6651201e1e6c52
                    if (ejeY == ejeYFinal) {
                        condicion2 = false;
                        condicion1 = false;
                    }
                    ejeY--;
                }
            }
            if (direccion.equals(arriba)) {
                int ejeYFinal = ejeY + posiciones;
                while (condicion2) {
<<<<<<< HEAD
                    ejeY++;
                    System.out.printf("El personaje se mueve a la posición x = %d, y = %d\n", ejeX, ejeY);

=======
                    System.out.printf("El personaje se mueve a la posición x = %d, y = %d\n", ejeX, ejeY);
                    
>>>>>>> 0ad569b335fcde9bc5839071fc6651201e1e6c52
                    if (ejeY == ejeYFinal) {
                        condicion2 = false;
                        condicion1 = false;
                    }
                    ejeY++;
                }
            }
            if (direccion.equals(izquierda)) {
                int ejeXFinal = ejeX - posiciones;
                while (condicion2) {
                    ejeX--;
                    System.out.printf("El personaje se mueve a la posición x = %d, y = %d\n", ejeX, ejeY);
<<<<<<< HEAD
=======
                    
>>>>>>> 0ad569b335fcde9bc5839071fc6651201e1e6c52

                    if (ejeX == ejeXFinal) {
                        condicion2 = false;
                        condicion1 = false;
                    }
                    ejeX--;
                }
            }
            if (direccion.equals(derecha)) {
                int ejeXFinal = ejeX + posiciones;
                while (condicion2) {
                    ejeX++;
                    System.out.printf("El personaje se mueve a la posición x = %d, y = %d\n", ejeX, ejeY);
                    
<<<<<<< HEAD
                    
                    if (ejeX == ejeXFinal) {
=======

                    if (ejeX  > ejeXFinal) {
>>>>>>> 0ad569b335fcde9bc5839071fc6651201e1e6c52
                        condicion2 = false;
                        condicion1 = false;
                    }
                    ejeX++;
                }
            }

        }
        sc.close();
    }
}
