package ex2_construct;

public class Pen {
	private String color;	//외부에서 함부로 접근할 수 없도록 private. 따라서 생성자를 통해 초기화될 때를 제외하고는 값을 바꿀 수 없다.
	private int price;
	
	//멤버변수의 초기화는 생성자에서 이루지는 것이 속도적으로 빠르다.
	public Pen() {
		this.color = "black";
		this.price = 500;
	};
	
	//생성자 오버로딩
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	};
	
	public void printInfo() {
		System.out.println("색상 : "+color+" 가격 : "+price);
	}
}
