import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Paso 1: Declarar una variable Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Pedir al usuario que introduzca un número entero
        System.out.print("Ingrese un número para generar su tabla de multiplicar: ");
        int number = scanner.nextInt();

        // Paso 3: Mostrar encabezado
        System.out.println("Tabla de multiplicar del " + number + ":");

        // Paso 4: Utilizar un bucle for para generar la tabla de multiplicar del 1 al 10
        for (int i = 1; i <= 10; i++) {
            // Paso 5: Calcular el resultado de la multiplicación
            int result = number * i;

            // Paso 6: Mostrar cada línea de la tabla de multiplicar
            System.out.println(number + " x " + i + " = " + result);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
