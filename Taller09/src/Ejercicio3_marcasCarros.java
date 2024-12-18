/**
 *Genera una aplicación que permita ingresar valores a un arreglo de cadenas.
 * El arreglo almacena el número de elementos que el usuario lo disponga.
 * Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.
 * Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe permitir ingresar ese número elementos.
 * Considerar las siguientes excepciones, no se contabilizan dentro del número de elementos, marcas que empiecen con las letras A, C, T.
 *
 * @author Francis Tapia
 */
import java.util.Scanner;
public class Ejercicio3_marcasCarros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cantidad;
        System.out.println("INGRESE LA CANTIDAD DE MARCAS DE VEHICULOS A INGRESAR:");
        cantidad = tcl.nextInt();
        tcl.nextLine();
        String[] marcas = new String[cantidad];
        int contadorValidas = 0;
        for (int i = 0; contadorValidas < cantidad; i++) {
            System.out.println("Ingrese la marca del vehiculo:");
            String marca = tcl.next();
            if (marca.toUpperCase().startsWith("A") || marca.toUpperCase().startsWith("C") || marca.toUpperCase().startsWith("T")) {
                System.out.println("Marca no valida. No se permiten marcas que empiecen con A, C o T.");
                continue;
            }
            marcas[contadorValidas] = marca;
            contadorValidas++;
        }
        System.out.println("\nLas marcas de vehiculos validas ingresadas son:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("- " + marcas[i]);
        }
    }
}
/**
 * run:
 * INGRESE LA CANTIDAD DE MARCAS DE VEHICULOS A INGRESAR:
 * 2
 * Ingrese la marca del vehiculo:
 * Auidi
 * Marca no valida. No se permiten marcas que empiecen con A, C o T.
 * Ingrese la marca del vehiculo:
 * Ford
 * Ingrese la marca del vehiculo:
 * Susuki
 * Las marcas de vehiculos validas ingresadas son:
 * - Ford
 * - Susuki
 * BUILD SUCCESSFUL (total time: 11 seconds)
 */