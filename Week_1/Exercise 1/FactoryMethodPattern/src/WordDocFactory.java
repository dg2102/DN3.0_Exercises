public class WordDocFactory extends DocumentFactory  {
    @Override
    public Document createDocument() {
        return new WordDoc();
    }
}