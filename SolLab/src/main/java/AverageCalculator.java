import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Paso 1: Declarar una variable Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Pedir al usuario que introduzca la cantidad de números
        System.out.print("Ingrese la cantidad de números que desea promediar: ");
        int count = scanner.nextInt();

        // Paso 3: Declarar variables para la suma y el promedio
        double sum = 0;

        // Paso 4: Utilizar un bucle for para pedir cada número
        for (int i = 1; i <= count; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double number = scanner.nextDouble();

            // Paso 5: Sumar cada número ingresado
            sum += number;
        }

        // Paso 6: Calcular el promedio
        double average = sum / count;

        // Paso 7: Mostrar el resultado
        System.out.println("El promedio de los " + count + " números es: " + average);

        // Cerrar el scanner
        scanner.close();
    }
}