/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareabucles;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class E2 {
    public static void main(String[] args) {
        
        
        int sumaImpar = 0;
        int sumaPar = 0;
        
        for(int i = 0; i<=100;i++){
            if(i % 2 == 0){
                sumaPar = sumaPar + i;
            }else{
                sumaImpar = sumaImpar + i;
            }
            
        }
        System.out.printf("La suma de los pares es: %d\n"
                + "La suma de los impares es: %d\n",sumaPar,sumaImpar);
    }
}
