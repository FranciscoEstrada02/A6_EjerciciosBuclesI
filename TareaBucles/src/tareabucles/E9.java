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
public class E9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra");
        String palabra = sc.nextLine();
        
        for(int i = 0; i < palabra.length()/2;i++){
            System.out.println(palabra.charAt(i));
        }
        sc.close();
    }
}
