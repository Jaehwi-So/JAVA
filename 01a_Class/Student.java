package java1;

//객체 Student. 객체는 속성과 함수(매서드)로 구성되어 있다.
public class Student {


	//************생성자************************
	//생성자. 객체를 생성할 시 가장 먼저 실행된다.
	Student(String name, double weight, int age, Student[] friend){
		this.name=name;
		this.weight=weight;
		this.age=age;
		this.friend=friend;

	}
	//이처럼 매개변수의 개수에 따라서 서로 다른 생성자로 객체를 생성 가능하다. 이를 생성자의 오버라이딩이라고 한다.
	Student(String name, double weight, int age){
		this.name=name;
		this.weight=weight;
		this.age=age;
	}
	Student(){};  //디폴트 생성자. 원래 매개변수 없이 객체를 생성하는 디폴트 생성자는 클래스 생성시 기본으로 주지만 매개변수가 있는 생성자를 명시했을 경우 디폴트 생성자를 명시해 줄 필요성이 있다.

	//************속성***********************
	//학생이라는 객체의 속성. 이름, 몸무게, 나이 등이 있을 수 있다.
	//접근 제어자 public, private, protected
	public String name; //public : 외부 클래스에서 사용 가능하다.
	private double weight; //private : 외부 클래스에서 사용 불가능하다.
	protected int age; //protected : 같은 패키지 내부와 상속 관계의 클래스에서만 접근 가능하다.
	public Student[] friend; // 친구 목록을 나타내기 위해서 Student 배열을 사용하였다. 참조 자료형으로 객체 Student를 사용하였다.
	/*자료형
	 * 기본 자료형 : int,long,float,double 등
	 * 참조 자료형 : String,Student(객체) 등
	 */


	//************함수***********************
	/* 형식:
	 * 자료형 함수 이름(매개변수){
	 *
	 * }
	*/
	//함수. 매서드. 객체의 기능을 표현한다. 함수에도 접근 제어자를 달 수 있다. 다음 내용은 자기소개의 내용이다.
	//함수 내부에서 선언된 변수는 지역변수이며 함수 종료시 메모리상에서 사라진다. 함수에 static이라면 static인 변수 외에는 함수 외부에서 사용할 수 없다.

	public void introduce() {
		System.out.println("내 이름은 "+name+"이고 나이는 "+age+"세 이며 가장 친한 친구 중 한명은 "+friend[0].name+"이다.");
	}

    //*************************************************
}
