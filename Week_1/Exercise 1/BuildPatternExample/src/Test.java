public class Test {
    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                
                .build();

        Computer businessPC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM(16)
                .setStorage(512)
                
                .build();

    System.out.println("Gaming Computer: ");
    System.out.println("CPU: " + gamingPC.getCPU());
    System.out.println("RAM: " + gamingPC.getRAM() + "GB");
    System.out.println("Storage: " + gamingPC.getStorage() + "GB");

    System.out.println("\nBusiness Computer: ");
        System.out.println("CPU: " + businessPC.getCPU());
        System.out.println("RAM: " + businessPC.getRAM() + "GB");
        System.out.println("Storage: " + businessPC.getStorage() + "GB");
    }
    
}