public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        loadImageFromServer();
        this.filename = filename;
    }
    private void loadImageFromServer() {
        
        System.out.println("Loading image: " + filename);
        try {
            Thread.sleep(4000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}