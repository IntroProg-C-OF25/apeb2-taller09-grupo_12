
/**
 * Ejercicio 1
 * Con el objetivo practicar el uso del ciclo repetitivo for, se propone que dado un límite,
 * se presenten las siguientes figuras. Por ejemplo si el límite es 4:
 * 
 * Figura 1:
 *  *
 *  **
 *  ***
 *  ****
 * Figura 2:
 * 
 *      *
 *     ***
 *    *****
 *   *******
 * Figura 3:
 * 
 *     *
 *    ***
 *   *****
 *  *******
 *   *****
 *    ***
 *     *
 * @author Francis Tapia
 */
import java.util.Scanner;
public class Ejercicio1_figuras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lim;
        System.out.println("Deme nivel arbol: ");
        lim = tcl.nextInt();
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Deme nivel arbol: ");
        lim = tcl.nextInt();
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Deme nivel arbol: ");
        lim = tcl.nextInt();
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = lim - 2; i >= 0; i--) {
            for (int j = 0; j < lim - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
