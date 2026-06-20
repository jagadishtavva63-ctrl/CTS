import java.io.File;
import java.io.IOException;

public class PdfDocument implements Document {

    @Override
    public void open() {

        try {
            File folder = new File("Documents");
            folder.mkdir();

            File file = new File(folder, "Sample.pdf");

            if (file.createNewFile()) {
                System.out.println("✓ PDF Document created : " + file.getName());
            } else {
                System.out.println("✓ PDF Document already exists.");
            }

        } catch (IOException e) {
            System.out.println("Error creating PDF document.");
        }
    }
}