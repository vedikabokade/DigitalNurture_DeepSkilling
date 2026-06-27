
public class PdfDocumentCreater extends Creator {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }   
    
}
