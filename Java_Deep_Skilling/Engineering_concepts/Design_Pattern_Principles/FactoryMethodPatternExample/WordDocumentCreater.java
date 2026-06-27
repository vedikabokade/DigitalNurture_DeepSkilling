
public class WordDocumentCreater extends Creator{
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
