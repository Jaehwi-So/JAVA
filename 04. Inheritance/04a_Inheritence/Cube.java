package inheritance;

//하위 클래스 Cube : 상위 클래스 Cuboid보다 구체적인 클래스
//Cube는 Cuboid을 상속받음. 즉 Rectangle과 Cuboid의 속성과 매서드를 사용 가능하다
public class Cube extends Cuboid {
	//본래 하위 클래스가 호출 될 때 상위 클래스의 디폴트 생성자가 먼저 호출된다. 
	//만약 상위 클래스에서 매개변수가 있는 생성자를 이용할 시 디폴트 생성자가 명시되어 있지 않다면 하위 클래스에서 오류가 발생한다.
	Cube(double w){
		//super : 하위 클래스에서 상위 클래스를 참고할 때 사용한다.
		super(w, w, w); //super() : 하위 클래스에서 상위 클래스로 접근한다. 상위 클래스의 생성자를 호출함.
	}	

}
