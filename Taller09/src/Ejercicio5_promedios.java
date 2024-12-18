/**
 * Dados los siguientes arreglos
 * double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
 * String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
 * Genere los datos para el arreglo
 * String[] promediosCualitativos = new String[7];
 * Promedio Regular son todas las notas >=0 y <=5.9
 * Promedio Bueno son todas las notas >=6 y <=8.9
 * Promedio Sobresaliente son todas las notas >=9 y <=10
 * Finalmente presentar un reporte como el que sigue:
 * Kimberly Gonzalez promedio: 10,00 promedio cualitativo ?
 * Mark Hogan promedio: 10,00 promedio cualitativo ?
 * Teresa Martinez promedio: 9,10 promedio cualitativo ?
 * Julia Johnson promedio: 7,00 promedio cualitativo ?
 * Mark Cook promedio: 6,10 promedio cualitativo ?
 * Jennifer Manning promedio: 4,00 promedio cualitativo ?
 * Juan Vasquez promedio: 8,00 promedio cualitativo ?
 * @author Francis Tapia
 */
public class Ejercicio5_promedios {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCuali = new String[7];
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 0 && promedios[i] <= 5.9) {
                promediosCuali[i] = "REGULAR";
            } else if (promedios[i] >= 6 && promedios[i] <= 8.9) {
                promediosCuali[i] = "BUENO";
            } else if (promedios[i] >= 9 && promedios[i] <= 10) {
                promediosCuali[i] = "SOBRESALIENTE";
            }
        }
        System.out.println("Reporte de Promedios Cualitativos:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.printf("%s promedio: %.2f promedio cualitativo: %s\n",
                    estudiantes[i], promedios[i], promediosCuali[i]);
        }
    }
}
/**
 * run: Reporte de Promedios Cualitativos: Kimberly Gonzalez promedio: 10,00
 * promedio cualitativo: SOBRESALIENTE Mark Hogan promedio: 10,00 promedio
 * cualitativo: SOBRESALIENTE Teresa Martinez promedio: 9,10 promedio
 * cualitativo: SOBRESALIENTE Julia Johnson promedio: 7,00 promedio cualitativo:
 * BUENO Mark Cook promedio: 6,10 promedio cualitativo: BUENO Jennifer Manning
 * promedio: 4,00 promedio cualitativo: REGULAR Juan Vasquez promedio: 8,00
 * promedio cualitativo: BUENO BUILD SUCCESSFUL (total time: 0 seconds)
 */
