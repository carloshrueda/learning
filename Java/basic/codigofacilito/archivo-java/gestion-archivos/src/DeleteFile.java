import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("ejemplo.txt");

        if(file.delete()) {
            System.out.println("File delete successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
