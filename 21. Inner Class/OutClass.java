package innerclassxx;

//외부 클래스 OutClass
public class OutClass {
	private int number; //private형은 내부 클래스에서도 사용 가능하다.
	private int number2;
	private InClass innerClass; //OutClass 안의 내부 클래스 innerClass
	
	public OutClass(int n1, int n2) {
		this.number=n1;
		this.number2=n2;
		innerClass = new InClass(); //OutClass 생성시 InClass 생성
	}
	
	//=================인스턴스 내부 클래스====================
	/*
	 인스턴스 내부 클래스는 주로 외부 클래스 내부에서만 생성하여 사용하는 객체를 선언할 때 사용한다.
	 다음과 같은 클래스는 다른 외부 클래스에서 사용할 일이 없는 경우 내부 인스터스 클래스로 정의한다.
	 외부 클래스를 먼저 생성하지 않고 인스턴스 내부 클래스를 사용할 수 없다.
	 */
	public class InClass{
		int inNum=100;		
		//static int num = 200; // 정적 변수&메서드 선언은 불가능하다.
		void printNum() {
			System.out.println("inner class num : "+inNum);
		}	
		
		int plusOperator(int num, int num2) {
			return num+num2;
		}
	}
	//=================인스턴스 내부 클래스====================
	
	//==================정적 내부 클래스=====================
	//정적 내부 클래스는 외부 클래스 생성과 무관하게 사용할 수 있어야 하고 정적 변수를 사용할 수 있게 하려면 정적 내부 클래스를 사용한다.
	//정적 메서드와 일반 메서드 두개 모두 사용 가능하다.
	static class InStaticClass{
		static int number3=100;
		int number4=100;
		
		//정적 메서드
		static int staticClassInput(int num) {
			//number4++; //정적 메서드에서는 외부 클래스의 인스턴스 변수 사용 불가능. 정적 메서드에서는 내부 클래스와 외부 클래스의 정적 변수(static 변수)만 사용 가능하다.
			return num+number3;	
		}
		
		//일반 메서드
		int ClassInput(int num) {
			return num+this.number4;	//일반 메서드에서는 외부 클래스의 인스턴스 변수는 사용 불가능하지만 정적 변수와 내부 클래스의 인스턴스 변수와 정적 변수를 사용 가능하다.
		}
		
	}
	//==================정적 내부 클래스=====================
	
	//==================지역 내부 클래스=====================
	//메서드 내부에서 선언되는 클래스. 지역 변수와 같이 메서드 내부에서만 사용 가능하다.
	public double localClassTest() {
		int num=100; //지역변수
		
		//지역 내부 클래스 Point
		class Point{
			double x;
			double y;
			Point(double x, double y){
				this.x=x;
				this.y=y;
			}
			double pointCalculate(Point p1) {
				//지역 내부 클래스에서 사용되는 지역 변수는 상수로 처리된다.
				//num=200; //지역변수는 상수로 바뀌므로 값을 변경할 수 없다.
				return Math.sqrt((this.x-p1.x)*(this.x-p1.x)+(this.y-p1.y)*(this.y-p1.y));
			}
		}
		Point c1 = new Point(100,200);
		Point c2 = new Point(50,70);
		return c1.pointCalculate(c2);

		
	}
	//==================지역 내부 클래스=====================
	
	//==================익명 내부 클래스=====================
	//익명 내부 클래스는 하나의 인터페이스 혹은 하나의 추상 클래스를 바로 생성할 수 있다. 익명 내부 클래스는 변수에 직접 대입하는 경우도 있으며 
	//메서드 내부에서 인터페이스나 추상 클래스를 직접 구현하는 경우도 있다.
		InClass annonyClassTest() {
		
		//클래스 InClass를 익명 내부 클래스로 바로 반환시킨다.
		return new InClass(){
			@Override
			public int plusOperator(int num, int num2) {
				return (num+num2)*100;
			}
		};
	}
		
	//변수에 직접 익명 내부 클래스를 대입하는 경우. Human 인터페이스를 직접 구현하였다.
		Human ac = new Human() {
			@Override
			public void introduce() {
				System.out.println("자기 소개");
			}			
		};

	//==================익명 내부 클래스=====================
	public int InClassUsing() {
		return innerClass.plusOperator(this.number,this.number2);
	}
	
	public static void main(String[] args) {
		OutClass c1 = new OutClass(10,20);
		OutClass.InClass c2 = c1.new InClass(); //다른 클래스에서 인스턴스 내부 클래스를 생성할 시에는 이러한 방식으로 생성한다.
		//단 다른 클래스에서 내부 클래스를 사용하려면 내부 클래스가 private로 선언되어서는 안된다. == 어떤 클래스의 내부에서만 사용하려면 private으로 선언
		System.out.println("직접 내부 클래스 사용 연산  : "+c2.plusOperator(100,200));
		System.out.println("내부 클래스 사용 연산 호출 : "+c1.InClassUsing());
		
		OutClass.InStaticClass s1 = new OutClass.InStaticClass(); // 정적 내부 클래스의 경우 외부 클래스를 생성하지 않고 바로 내부 클래스 생성 가능.
		System.out.println("정적 내부 클래스(정적 메서드) 사용 : "+s1.staticClassInput(10));
		System.out.println("정적 내부 클래스 사용(일반 메서드) : "+s1.ClassInput(10));
		
		System.out.println("지역 내부 클래스 사용 : "+c1.localClassTest());
		OutClass.InClass c3 = c1.annonyClassTest();
		System.out.println("익명 내부 클래스 이용 :"+c3.plusOperator(10, 20)); // 메서드를 호출할 때 익명 클래스 생성하기
		c1.ac.introduce(); //변수에 직접 익명 내부 클래스 대입
	}


}
/*
#인스턴스 내부 클래스 : 외부 클래스의 멤버 위치로 구현/ 외부 인스턴스 변수 사용 가능/외부 클래스 생성 후 내부 클래스 생성
#정적 내부 클래스 : 외부 클래스의 멤버 위치로 구현/ 외부 인스턴스 변수 사용 불가능/외부 클래스 생성이 되지 않아도 생성 가능
#지역 내부 클래스 : 메서드 내부에 구현/ 외부 인스턴스 변수 사용 가능/ 메서드를 호출할 때 생성
#익명 내부 클래스 : 메서드 내부에 구현&변수에 대입하여 직접 구현.외부 인스턴스 변수 사용 가능/ 메서드를 호출할 때 생성, 인터페이스 타입 변수에 대입할 때 new예약어를 사용하여 생성
 */
