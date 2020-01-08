package objectxx;
/*
 Object 클래스 : 모든 자바 클래스의 최상위 클래스. 모든 클래스는 Object클래스로부터 암묵적으로 상속을 받는다. 
 */
public class Objecttest {
	
	//toString() : 인스턴스의 정보를 문자열로 반환해 주는 메서드
	void function_toString(Student s1, Integer i, Student2 s2) {
		System.out.println(s1.toString()); //toString()의 원형 : 클래스 이름@해시코드 값의 형태로 출력
		System.out.println(s1); //println문에 참조 변수를 넣으면 자동으로 toString()메서드가 호출된다.
		System.out.println(i.toString());
		System.out.println(i); //String과 Integer등 일부 클래스는 toString()의 메서드를 재정의 해두어 원형으로 출력되지 않는다.
		System.out.println(s2.toString());
		System.out.println(s2); //Student2 클래스에서는 toString() 메서드를 재정의 해두어 학생의 정보를 출력되게 하였다.
	}
	
	//equals():두 인스턴스의 주소를 비교하여 boolean 값으로 반환해준다.
	void function_equals(Object s1, Object s2) { //Object는 상위 클래스이므로 Student형 대신 매개변수로 사용 가능하다.
		if(s1.equals(s2)) {
			System.out.println("동일한 학생입니다");
		}
		else {
			System.out.println("동일하지 않은 학생입니다");
		}
		
	}
	
	//hashcode() : 인스턴스의 해시 값(메모리 위치)를 반환한다.
	void function_hashCode(Object o) {
		System.out.println("주소값 : "+o.hashCode());
	}
	
	//clone() : 해당 인스턴스를 복사한다.
	Object function_clone(Student2 o) throws CloneNotSupportedException {
		Student2 clone = (Student2)o.clone();
		return clone;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Objecttest test = new Objecttest();
		
		Student s1 = new Student("철수",25,100);
		Student2 s2 = new Student2("영수",23,101);
		test.function_toString(s1,100,s2);	
		Student s3 = s1;
		Student s4 = new Student("영희",22,102);
		test.function_equals(s1,s3);
		test.function_equals(s1,s4);		
		Student2 s5 = new Student2("영수",23,101); //Student2 클래스에서 equals()의 재정의를 통해서 ID가 같으면 동일한 인스턴스가 아니더라도 같다고 판단하도록 하였다.
		test.function_equals(s2,s5);
		
		test.function_hashCode(s1);
		test.function_hashCode(s2);
		test.function_hashCode(s5);
		
		System.out.println("복제 : " +test.function_clone(s2).toString()); //s2의 clone
	}

}
