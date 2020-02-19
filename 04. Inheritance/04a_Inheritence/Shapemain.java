package inheritance;

public class Shapemain {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2,4);
		Cuboid c1 = new Cuboid(3,5,2);
		Rectangle c2 = new Cube(3);  //다음과 같이 상위 클래스 형을 사용할 수 있다. 하위 클래스는 상위 클래스 자료형으로 형 변환이 가능하기 때문. 역은 성립 안한다.
		System.out.println("<사각형 r1> "+r1.showInfo()+" 넓이 : "+r1.calcArea());
		System.out.println("<육면체 c1> "+c1.showInfo()+" 부피 : "+c1.calcArea());
		System.out.println("<정육면체 c2> "+c2.showInfo()+" 부피 : "+c2.calcArea());
	}

}
