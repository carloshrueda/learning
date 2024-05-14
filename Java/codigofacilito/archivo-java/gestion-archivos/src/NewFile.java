import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) {
        File file = new File("ejemplo.txt");

        try {
            boolean created = file.createNewFile();

            if (created) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error to create file");
            e.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Error to create new file");
            ex.printStackTrace();
        }
    }
}
