abstract class Document {
    protected abstract void createDocument();;
}

class WordDocument extends Document {
    public void createDocument() {
        System.out.println("Word document created");
    }
}

class ExcelDocument extends Document {
    public void createDocument() {
        System.out.println("Excel document created");
    }
}

class PDFDocument extends Document {
    public void createDocument() {
        System.out.println("PDF document created");
    }
}

public class Main {
    public static void main(String[] args) {
        Document wordDocument = new WordDocument();
        wordDocument.createDocument();  

        Document excelDocument = new ExcelDocument();
        excelDocument.createDocument();

        Document pdfDocument = new PDFDocument();
        pdfDocument.createDocument();
    }
}


/*

Output:

Word document created
Excel document created
PDF document created

*/