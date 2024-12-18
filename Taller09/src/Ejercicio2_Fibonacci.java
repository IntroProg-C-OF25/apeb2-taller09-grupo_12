/**
 * Escriba un programa que permita presentar la siguiente serie:
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos
 * @author Jorge Fernandez
 */
import java.util.Scanner;
public class Ejercicio2_Fibonacci {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros de la serie: ");
        int n = tcl.nextInt();
        int a = 1, b = 1;
        for (int i = 1; i <= n; i++) {
            int fibonacci;
            if (i == 1 || i == 2) {
                fibonacci = 1;
            } else {
                fibonacci = a + b;
                a = b;
                b = fibonacci;
            }
            int contPrimos = 0;
            int num = 2;
            while (true) {
                boolean esPrimo = true;
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    contPrimos++;
                    if (contPrimos == i) {
                        break;
                    }
                }
                num++;
            }
            System.out.print(fibonacci + "/" + num);
            if (i < n) {
                System.out.print(", ");
            }
        }
    }
}
