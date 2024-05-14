import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        String line;
        String filePath = "ejemplo.txt";

        /* El Try Resources se le pasa un objeto en el cual
        Si hubiera un error se cerrara el archivo automáticamente
        En este caso el InputStream implementa las clases Closeable y AutoCloseable
         */
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        }
    }
}
