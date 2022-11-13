
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

        System.out.println("Ingrese su posicion inicial en el eje X");
        int ejeX = sc.nextInt();
        System.out.println("Ingrese su posicia inical en el eje Y");
        int ejeY = sc.nextInt();

        //Limpieza buffer
        sc.nextLine();

        boolean condicion = true;

        while (condicion) {
            System.out.println("Ingrese hacia donde quiere mover su personaje");
            String direccion = sc.nextLine();
            System.out.println("Ingrese cuantas posiciones desea moverse");
            int posiciones = sc.nextInt();
            
            if(direccion == "abajo"){
                int ejeYFinal = ejeY - posiciones;
                for(int i = ejeX;i == ejeYFinal;i--){
                    System.out.printf("El personaje se mueve a la posición x = %d, y = %d",ejeX,i);
                }
            }
            if(direccion == "arriba"){
                ejeY = ejeY + posiciones;
            }
            if(direccion == "derecha"){
                ejeX = ejeX + posiciones;
            }
            if(direccion == "izquierda"){
                ejeX = ejeY - posiciones;
            }
            
            
            

        }
    }
}
