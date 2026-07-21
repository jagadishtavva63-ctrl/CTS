import java.io.File;
import java.io.IOException;

public class ExcelDocument implements Document {

    @Override
    public void open() {

        try {
            File folder = new File("Documents");
            folder.mkdir();

            File file = new File(folder, "Sample.xlsx");

            if (file.createNewFile()) {
                System.out.println("✓ Excel Document created : " + file.getName());
            } else {
                System.out.println("✓ Excel Document already exists.");
            }

        } catch (IOException e) {
            System.out.println("Error creating Excel document.");
        }
    }
}