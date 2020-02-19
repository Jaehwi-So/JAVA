package ex2_construct;

public class PenMain {
	
	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		p1.printInfo();
		
		System.out.println("===================");
		
		Pen p2 = new Pen("gold", 2000);
		p2.printInfo();
		
	}

}
