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
public class E4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de ventas a introducir");
        int numVentas = sc.nextInt();
        
        int sumaVentas;
        int totalVentas = 0;
        for(int i = 0; i < numVentas; i++){
            System.out.println("Valor de la venta: ");
            sumaVentas = sc.nextInt();
            
            totalVentas = totalVentas + sumaVentas;
        }
        System.out.println("El total de ventas es: " + totalVentas);
        sc.close();
    }
}
