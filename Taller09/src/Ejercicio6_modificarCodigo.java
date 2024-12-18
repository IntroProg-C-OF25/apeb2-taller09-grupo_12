/**
 *
 * @author Jorge Fernández
 */
import java.util.Scanner;
public class Ejercicio6_modificarCodigo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra:");
            inicial = entrada.nextLine().toUpperCase();
            for (int i = 0; i < estudiantes.length; i++) {
                if (estudiantes[i].toUpperCase().startsWith(inicial)) {
                    bandera = false;
                    System.out.println("La inicial coincide con el nombre: " + estudiantes[i]);
                    break;
                }
            }
            if (bandera) {
                System.out.println("No se encontro ningun nombre que comience con esa letra. Intente nuevamente.");
            }
        }
    }
}
/***
 * run:
 * Ingrese una letra:
 * K
 * La inicial coincide con el nombre: Kimberly
 * BUILD SUCCESSFUL (total time: 4 seconds)
 EN CASO DE NO COINCIDIR NINGUNA LETRA EL IDE MUESTRA ESTO
 * run:
 * Ingrese una letra:
 * C
 * No se encontro ningun nombre que comience con esa letra. Intente nuevamente.
 * Ingrese una letra:
 * A
 * La inicial coincide con el nombre: Alcides
 * BUILD SUCCESSFUL (total time: 9 seconds)
 */
