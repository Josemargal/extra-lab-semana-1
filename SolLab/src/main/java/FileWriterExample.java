import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExample {
    public static void main(String[] args) {
        // Paso 1: Declarar una variable Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Paso 2: Pedir al usuario que introduzca el nombre del archivo
            System.out.print("Ingrese el nombre del archivo donde desea escribir: ");
            String fileName = scanner.nextLine();

            // Paso 3: Crear un objeto FileWriter para escribir en el archivo
            FileWriter writer = new FileWriter(fileName);

            // Paso 4: Instruir al usuario sobre cómo introducir líneas de texto
            System.out.println("Ingrese líneas de texto (línea vacía para terminar):");

            // Paso 5: Utilizar un bucle while para leer líneas hasta que se introduzca una línea vacía
            String line;
            while (true) {
                line = scanner.nextLine();

                // Si la línea está vacía, salir del bucle
                if (line.isEmpty()) {
                    break;
                }

                // Paso 6: Escribir la línea en el archivo seguida de un salto de línea
                writer.write(line + "\n");
            }

            // Paso 7: Cerrar el FileWriter
            writer.close();

            System.out.println("Las líneas se han escrito correctamente en el archivo " + fileName);

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}
