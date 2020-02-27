package ex2_interface;

//인터페이스는 다중 '구현'이 가능하다. 상속과 차이점중 하나. 다중 '상속'이 안된다는 점
//인터페이스를 사용하는 목적 중 하나는 '강제성'
public class Kitchen implements Menu1, Menu2, Menu3{

	@Override
	public String jjajang() {
		return "중면+춘장";
	}

	@Override
	public String jjambbong() {
		return "중면+해물";
	}

	@Override
	public String tangsuyuck() {
		return "고기+소스";
	}
	
	@Override
	public String boggembab() {
		return "밥+야채";
	}

}
