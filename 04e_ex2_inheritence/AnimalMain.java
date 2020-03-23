package ex2_inheritence;

public class AnimalMain {
	public static void main(String[] args) {
		Bear b = new Bear();
		System.out.println("곰의 눈 개수 : "+b.getEye());	//부모 클래스 Animal의 메서드
		System.out.println("곰의 다리 개수 : "+b.getLeg());
		System.out.println("곰의 특징 : "+b.gallbladder);	//자식 클래스 Bear의 속성
		System.out.println("================");
		
		Lion l = new Lion();
		System.out.println("사자의 눈 개수 : "+l.getEye());	//부모 클래스 Animal의 메서드
		System.out.println("사자의 다리 개수 : "+l.getLeg());
		System.out.println("사자의 특징 : "+l.mane);	//자식 클래스 Lion의 속성
		//System.out.println("사자의 특징 "+l.gallbladder); 사자에게는 없는 특징. 
		System.out.println("================");
		
		Snake s = new Snake();
		System.out.println("뱀의 눈 개수 : "+s.getEye());	//부모 클래스 Animal의 메서드
		System.out.println("뱀의 다리 개수 : "+s.getLeg());	//오버라이딩된 메서드 사용
		System.out.println("뱀의 특징 : "+s.poison);	//자식 클래스 Snake의 속성
		System.out.println("================");
		
		Spider sp = new Spider();
		System.out.println("거미의 눈 개수 : "+sp.getEye());	//오버라이딩된 메서드 사용
		System.out.println("거미의 다리 개수 : "+sp.getLeg());	//오버라이딩된 메서드 사용
		System.out.println("거미의 특징 : "+sp.web);		//자식 클래스 Spider의 속성
	}

}
