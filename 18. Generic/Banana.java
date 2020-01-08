package Generic;

public class Banana extends Food {

	public void slice() {
		System.out.println("바나나가 잘립니다");
	}
	@Override
	public String toString() {
		return "바나나로 쉐이크를 만듭니다";
	}

}

