public class test {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        image1.display(); //loading
        image1.display(); //displaying

        image2.display();//loading
        image2.display();//displaying
    }
}