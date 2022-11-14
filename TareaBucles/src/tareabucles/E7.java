/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareabucles;

import java.util.Scanner;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un texto");
        String cadena = sc.next();
        int x = cadena.length() - 1;
        boolean capicua = true;
        for (int i = 0; i < x; i++) {
            if (cadena.charAt(i) != cadena.charAt(x)) {
                capicua = false;
            }
            x--;
        }
        if (capicua) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
        sc.close();
    }

}
