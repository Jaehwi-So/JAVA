package ex2_interface;

//다중 상속된 인터페이스를 구현하였다.
public class Kitchen2 implements MyMenu{
	
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