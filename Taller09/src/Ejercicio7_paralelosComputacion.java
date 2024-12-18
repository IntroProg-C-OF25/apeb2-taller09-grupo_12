/**
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el ciclo,
 * la Dirección de la carrera de Computación a solicitado las siguientes estadísticas en función a los promedios obtenidos del ciclo por estudiantes
 * (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar).
 * Promedio del ciclo, del paralelo C.
 * Listado de estudiantes con su nota por encima del promedio.
 * Listado de estudiantes con su nota por debajo del promedio.
 * Estudiante con la mejor calificación.
 * Estudiante con la calificación mas baja.
 *
 * @author Francis Tapia
 */
import java.util.Random;
public class Ejercicio7_paralelosComputacion {
    public static void main(String[] args) {
        Random random = new Random();
        int cantEst = 28;
        String mejorEst = "", peorEst = "";
        double sumaprom = 0, promedioCiclo;
        double[] prom = new double[cantEst];
        String[] estu = new String[cantEst];
        for (int i = 0; i < cantEst; i++) {
            estu[i] = "Estu_ " + (i + 1);
        }
        for (int i = 0; i < cantEst; i++) {
            prom[i] = Math.random() * 10;
        }
        for (int i = 0; i < cantEst; i++) {
            sumaprom += prom[i];
        }
        promedioCiclo = (sumaprom / cantEst);
        System.out.println("Promedio del ciclo: " + String.format("%.2f", promedioCiclo));
        System.out.println("\nEstudiantes con calificacion por encima del promedio:");
        for (int i = 0; i < cantEst; i++) {
            if (prom[i] > promedioCiclo) {
                System.out.println(estu[i] + "= " + String.format("%.2f", prom[i]));
            }
        }
        System.out.println("\nEstudiantes con calificacion por debajo del promedio:");
        for (int i = 0; i < cantEst; i++) {
            if (prom[i] < promedioCiclo) {
                System.out.println(estu[i] + "= " + String.format("%.2f", prom[i]));
            }
        }
        double mejorprom = prom[0];
        double peorprom = prom[0];
        mejorEst = estu[0];
        peorEst = estu[0];
        for (int i = 1; i < cantEst; i++) {
            if (prom[i] > mejorprom) {
                mejorprom = prom[i];
                mejorEst = estu[i];
            }
        }
        System.out.println("\nEstudiante con la mejor calificacion: " + mejorEst + "= " + String.format("%.2f", mejorprom));
        for (int i = 1; i < cantEst; i++) {
            if (prom[i] < peorprom) {
                peorprom = prom[i];
                peorEst = estu[i];
            }
        }
        System.out.println("\nEstudiante con la peor calificacion: " + peorEst + "= " + String.format("%.2f", peorprom));
    }
}
/**
 * run:
 * Promedio del ciclo: 5,06 
 * Estudiantes con calificacion por encima del promedio:
 * Estu_ 1= 7,94
 * Estu_ 4= 7,36
 * Estu_ 5= 9,09
 * Estu_ 6= 5,29
 * Estu_ 7= 7,63
 * Estu_ 9= 5,84
 * Estu_ 13= 7,78
 * Estu_ 14= 9,58
 * Estu_ 15= 7,44
 * Estu_ 16= 8,12
 * Estu_ 19= 7,89
 * Estu_ 20= 8,28
 * Estu_ 21= 8,54
 * Estu_ 22= 7,07
 * Estu_ 28= 5,62
 * 
 * Estudiantes con calificacion por debajo del promedio:
 * Estu_ 2= 2,36
 * Estu_ 3= 4,74
 * Estu_ 8= 4,39
 * Estu_ 10= 1,37
 * Estu_ 11= 1,30
 * Estu_ 12= 0,05
 * Estu_ 17= 2,15
 * Estu_ 18= 0,55
 * Estu_ 23= 2,03
 * Estu_ 24= 2,42
 * Estu_ 25= 2,34
 * Estu_ 26= 3,12
 * Estu_ 27= 1,43
 * 
 * Estudiante con la mejor calificacion: Estu_ 14= 9,58
 * 
 * Estudiante con la peor calificacion: Estu_ 12= 0,05
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */
