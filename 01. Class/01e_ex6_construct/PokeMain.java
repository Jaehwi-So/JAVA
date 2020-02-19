package ex3_construct;

public class PokeMain {
	public static void main(String[] args) {
		Pokemon p1 = new Pokemon();
		p1.setName("피카츄");
		p1.setType("전기");
		p1.myPoke();
		
		Pokemon p2 = new Pokemon("꼬부기", "물");
		p2.myPoke();
		
	}

}
