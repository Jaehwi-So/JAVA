package ex4_abstract;

public class UnitMain {
	public static void main(String[] args) {
		
		Terran t1 = new Terran("마린", 100, false);
		t1.decEnergy();
		t1.decEnergy();
		System.out.println( t1.getEnergy() );
		
		Protoss p1 = new Protoss("캐리어", 200, true);
		p1.decEnergy();
		System.out.println( p1.getEnergy());
		
		Zerg z1 = new Zerg("히드라", 300, false);
		z1.decEnergy();
		z1.decEnergy();
		System.out.println( z1.getEnergy());
		
	}
}
