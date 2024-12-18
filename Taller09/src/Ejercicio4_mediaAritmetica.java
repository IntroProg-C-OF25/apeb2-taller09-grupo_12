
/**
 * Dado el arreglo; determinar cuantos elementos están arriba de la
 * media aritmética y cuantos están por debajo de la medía aritmética.
 * int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 *
 * @author Jorge Fernández
 */
public class Ejercicio4_mediaAritmetica {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        double media = (double) suma / arreglo.length;
        int arribaDeLaMedia = 0, debajoDeLaMedia = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                arribaDeLaMedia++;
            } else if (arreglo[i] < media) {
                debajoDeLaMedia++;
            }
        }
        System.out.println("La media aritmetica es: " + media);
        System.out.println("Elementos arriba de la media: " + arribaDeLaMedia);
        System.out.println("Elementos debajo de la media: " + debajoDeLaMedia);
    }
}
/***
 * run:
 * La media aritmetica es: 9.538461538461538
 * Elementos arriba de la media: 8
 * Elementos debajo de la media: 5
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */