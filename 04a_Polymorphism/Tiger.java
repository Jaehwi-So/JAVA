package polymorphism;

//Animal의 하위 클래스 Tiger
public class Tiger extends Animal {
	public String food = "고기";
	public void move() {
		System.out.println("어슬렁 어슬렁");
	}
	public void eat() {
		System.out.println("호랑이가 "+food+"를 먹습니다.");
	}
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}

}

