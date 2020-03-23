package ex3_construct;

public class Pokemon {
	
	private String name;
	private String type;
	
	//생성자를 통해서 멤버변수를 초기화하면 오류를 방지할 수 있다.(실수로 setName이나 setType을 하지 않는 경우, 혹은 변수명을 잘못 대입하는 경우 등)
	public Pokemon(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	//디폴트 생성자
	public Pokemon() {};
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}

	public void myPoke() {
		System.out.println("이름 : "+this.name);
		System.out.println("타입 : "+this.type);
	}
}

