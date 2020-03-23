package ex2_inheritence;

public class Spider extends Animal{
	String web = "거미줄";
	
	//메서드의 오버라이딩
	@Override
	public int getEye() {
		return 4;
	}
	
	@Override
	public int getLeg() {
		return 8;
	}
}
