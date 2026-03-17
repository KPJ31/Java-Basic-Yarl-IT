class MainComputer {
    public static void main(String[] args) {
        Computer c1 = new Computer();

        c1.brand = "Dell";
        c1.processor = "Intel i5";
        c1.ram = 8;
        c1.storage = "1 TB";

        c1.showDetails();
        c1.start();
        c1.shutdown();

        System.out.println("--------------------------------------------------");

        Computer c2 = new Computer();

        c2.brand = "Hp";
        c2.processor = "Intel i9";
        c2.ram = 32;
        c2.storage = "5 TB";

        c2.showDetails();
        c2.start();
        c2.shutdown();
    }
}