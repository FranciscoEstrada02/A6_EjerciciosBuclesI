
package tareabucles;

import java.util.Scanner;

/**
 *
 * @author FranciscoEstradaCuen
 */
public class E10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        String palabra = sc.nextLine();
        int contadorVocales = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a'
                    || palabra.charAt(i) == 'e'
                    || palabra.charAt(i) == 'i'
                    || palabra.charAt(i) == 'o'
                    || palabra.charAt(i) == 'u') {

                contadorVocales = contadorVocales + 1;

            }
            System.out.println(palabra.charAt(i));
        }
        System.out.println("El numero de vocales es: " + contadorVocales);
        sc.close();
    }
}
