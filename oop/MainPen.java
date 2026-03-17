class MainPen {
	public static void main(String[] args) {
		pen p;
		p=new Pen();
		
		p.color="Red";
		p.medeIn="Srilanka";
		p.brand="Ten";
		p.height=10.5;
		p.price=100;
		
		p.write();
		
		System.out.println("Pen Color: "+p.color);
		System.out.println("Pen Madein: "+p.madeIn);
		System.out.println("Pen Brand: "+p.brand);
		System.out.println("Pen Height: "+p.height);
		System.out.println("Pen Price: ")+p.price;
	}
}