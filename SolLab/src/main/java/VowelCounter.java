import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        // Paso 1: Declarar una variable Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Pedir al usuario que introduzca una frase
        System.out.print("Ingrese una frase para contar sus vocales: ");
        String phrase = scanner.nextLine();

        // Paso 3: Convertir la frase a minúsculas para simplificar la comprobación
        phrase = phrase.toLowerCase();

        // Paso 4: Declarar un contador para las vocales
        int vowelCount = 0;

        // Paso 5: Utilizar un bucle for para recorrer cada carácter de la frase
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);

            // Paso 6: Verificar si el carácter es una vocal
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'á' || ch == 'é' || ch == 'í' || ch == 'ó' || ch == 'ú') {
                // Paso 7: Incrementar el contador si es una vocal
                vowelCount++;
            }
        }

        // Paso 8: Mostrar el número total de vocales
        System.out.println("La frase contiene " + vowelCount + " vocales.");

        // Cerrar el scanner
        scanner.close();
    }
}