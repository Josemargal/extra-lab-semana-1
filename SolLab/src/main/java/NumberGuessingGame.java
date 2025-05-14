import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Paso 1: Declarar una variable Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Generar un número aleatorio entre 1 y 100
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        // Paso 3: Inicializar variables para el juego
        int guess;
        int attempts = 0;
        boolean hasGuessed = false;

        // Paso 4: Dar instrucciones al usuario
        System.out.println("¡Bienvenido al Juego de Adivinanza de Números!");
        System.out.println("He pensado en un número entre 1 y 100.");

        // Paso 5: Utilizar un bucle while para permitir múltiples intentos
        while (!hasGuessed) {
            // Paso 6: Pedir al usuario que adivine el número
            System.out.print("Adivina el número: ");
            guess = scanner.nextInt();
            attempts++;

            // Paso 7: Comprobar si el usuario ha adivinado correctamente
            if (guess == secretNumber) {
                hasGuessed = true;
            } else if (guess < secretNumber) {
                // Paso 8: Dar una pista si el número es mayor
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else {
                // Paso 9: Dar una pista si el número es menor
                System.out.println("El número es menor. Intenta de nuevo.");
            }
        }

        // Paso 10: Mostrar mensaje de felicitación y número de intentos
        System.out.println("¡Felicidades! Has adivinado el número " + secretNumber + " correctamente.");
        System.out.println("Número de intentos: " + attempts);

        // Cerrar el scanner
        scanner.close();
    }
}
