package ex3_overloadwork;

public class BreadMain {
	public static void main(String[] args) {
		Bread b1 = new Bread();
		
		//빵을 만들었습니다
		b1.makeBread();
		
		//빵을 만들었습니다
		//빵을 만들었습니다
		//요청하신 2개의 빵을 만들었습니다
		b1.makeBread(3);	//parameter로 몇개를 만들것인지 전달
		
		
		//크림빵을 만들었습니다
		//크림빵을 만들었습니다
		//요청하신 두개의 크림빵을 만들었습니다.
		b1.makeBread(4, "크림빵");
	}
}

