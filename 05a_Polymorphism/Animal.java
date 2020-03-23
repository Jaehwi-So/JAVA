package polymorphism;

public class Animal {
	public String food;
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	public void eat() {
		System.out.println("동물이 "+food+"를 먹습니다.");
	}

}
