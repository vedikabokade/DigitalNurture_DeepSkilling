
public class ExcelDocumentCreater extends Creator {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }   
    
}
