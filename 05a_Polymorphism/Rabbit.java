package polymorphism;

//Animal의 하위 클래스 Rabbit
public class Rabbit extends Animal {
	public String food = "건초";
	public void move() {
		System.out.println("깡총 깡총");
	}
	public void eat() {
		System.out.println("토끼가 "+food+"를 먹습니다.");
	}
	public void hide() {
		System.out.println("토끼가 숨었습니다.");
	}

}

