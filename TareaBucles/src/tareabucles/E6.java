/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareabucles;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author festr
 */
public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random numAleatorio = new Random();
        
        boolean condicion = true;
        int n = numAleatorio.nextInt(-1000,1000);

        
        while(condicion){
            System.out.println("Intente adivinar el numero");
            int entrada = sc.nextInt();
            
            if(entrada < n){
                System.out.println("Es mayor");
                
            }else if(entrada > n){
                System.out.println("Es menor");
            }else if(entrada == n){
                System.out.println("Numero correcto!");
                condicion = false;
            }
        }
        
    }
}
