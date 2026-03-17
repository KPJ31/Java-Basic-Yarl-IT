class Computer {
	String brand;
	String processor;
	int ram;
	String storage;

	void showDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Processor: " + processor);
		System.out.println("RAM: " + ram + " gb");
		System.out.println("Storage: " + storage);
	}

	void start() {
        System.out.println(brand + " computer is starting...");
    }

    void shutdown() {
        System.out.println(brand + " computer is shutting down...");
    }
}