public class FactoryMethodTest {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("     Document Management System");
        System.out.println("    Factory Method Design Pattern");
        System.out.println("==========================================\n");

        DocumentFactory wordFactory = new WordFactory();
        DocumentFactory pdfFactory = new PdfFactory();
        DocumentFactory excelFactory = new ExcelFactory();

        System.out.println("Creating documents...\n");

        wordFactory.createAndOpenDocument();
        pdfFactory.createAndOpenDocument();
        excelFactory.createAndOpenDocument();

        System.out.println("\n------------------------------------------");
        System.out.println("Documents are stored inside:");
        System.out.println("FactoryMethodPatternExample/Documents/");
        System.out.println("------------------------------------------");
        System.out.println("Factory Method Pattern implemented successfully.");
    }
}