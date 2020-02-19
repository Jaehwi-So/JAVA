package ex4_static;

public class Bank {
	private String point; //은행 지점
	private String tel; // 은행 전화번호
	static float interest; //이자율
	
	public Bank(String point, String tel){
		this.point=point;
		this.tel=tel;
	}
	
	public void getInfo() {
		System.out.println("==================");
		System.out.println("지점 위치 :"+point);
		System.out.println("전화번호 :"+tel);
		System.out.println("이자율 :"+interest);
		System.out.println("==================");
	}
}

