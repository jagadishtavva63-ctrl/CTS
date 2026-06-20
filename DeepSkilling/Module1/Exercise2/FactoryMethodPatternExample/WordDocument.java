import java.io.File;
import java.io.IOException;

public class WordDocument implements Document {

    @Override
    public void open() {

        try {
            File folder = new File("Documents");
            folder.mkdir();

            File file = new File(folder, "Sample.docx");

            if (file.createNewFile()) {
                System.out.println("✓ Word Document created : " + file.getName());
            } else {
                System.out.println("✓ Word Document already exists.");
            }

        } catch (IOException e) {
            System.out.println("Error creating Word document.");
        }
    }
}