package inheritance;


//하위 클래스 Cuboid : 상위 클래스보다 구체적인 클래스
//Cuboid는 Rectangle을 상속받음. 즉 Rectangle의 속성과 매서드를 사용 가능하다
public class Cuboid extends Rectangle {
	protected double height;
	//본래 하위 클래스가 호출 될 때 상위 클래스의 디폴트 생성자가 먼저 호출된다. 
	//만약 상위 클래스에서 매개변수가 있는 생성자를 이용할 시 디폴트 생성자가 명시되어 있지 않다면 하위 클래스에서 오류가 발생한다.
	Cuboid(double w, double l, double h){
		//super : 하위 클래스에서 상위 클래스를 참고할 때 사용한다.
		super(w, l); //super() : 하위 클래스에서 상위 클래스로 접근한다. 상위 클래스의 생성자를 호출함.
		height=h;
	}
	
	//Override : 상위 클래스의 함수를 하위 클래스에 맞추어 재정의하여 사용할 때 오버라이딩 시킨다.
	@Override   //Override를 통하여 재정의된 매서드
	double calcArea() {
		return width*length*height;
	}
	
	@Override
	String showInfo() {
		return super.showInfo()+" 높이 : "+height; //상위 클래스의 매서드를 참조한다.
		
	}
	
	

}