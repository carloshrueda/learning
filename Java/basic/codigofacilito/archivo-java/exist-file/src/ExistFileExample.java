import java.io.File;

public class ExistFileExample {
    public static void main(String[] args) {
        File file = new File("ejemplo.txt");

        if(file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File no exists.");
        }
    }
}
