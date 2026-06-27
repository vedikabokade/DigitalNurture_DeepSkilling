
public class Main {
    public static void main(String[] args) {
        Creator excel = new ExcelDocumentCreater();
        Document excelDoc= excel.createDocument();
        excelDoc.open();

        Creator word = new WordDocumentCreater();
        Document wordDoc= word.createDocument();    
        wordDoc.open();

        Creator pdf = new PdfDocumentCreater();
        Document pdfDoc= pdf.createDocument();
        pdfDoc.open();
    }
}


//output
// Opening Excel Document
// Opening Word document
// Opening PDF Document