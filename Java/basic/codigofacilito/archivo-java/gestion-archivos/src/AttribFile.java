import java.io.File;

public class AttribFile {
    public static void main(String[] args) {
        File file = new File("ejemplo.txt");

        try {
            System.out.println("File name:\t" + file.getName() );
            System.out.println("Absolute path:\t" + file.getAbsolutePath());
            System.out.println("Writable:\t" + file.canWrite() );
            System.out.println("Readable:\t" + file.canRead() );
            System.out.println("File size in bytes:\t" + file.length() );
        } catch(Exception e) {
            System.out.println("Error get Attribute File");
            e.printStackTrace();
        }
    }
}
