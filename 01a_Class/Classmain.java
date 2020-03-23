package java1;
/* #1. 클래스, 객체, 패키지, 생성자
 * JAVA = 객체 지향 프로그래밍
 * 객체 지향 프로그래밍은 객체를 생성하고 객체 사이에 일어나는 일을 구현하는 프로그래밍이다.
 * 객체는 class로 표현되며 객체의 속성과 기능을 코드로 구현한 것이다.
 * 프로젝트 - 패키지  - 클래스1, 클래스2, 클래스3...
 * 클래스는 대문자로 이름을 짓는 것이 원칙
 */
public class Classmain {
	
	
	public static void main(String[] args) { //자바의 메인 함수. public : 접근 제어자 / static : 정적 함수임을 의미.
		Student s1 = new Student("홍길동",23,50);	//매개변수가 3개인 생성자로 객체 생성
		Student s2 = new Student("홍지동",23,50);	
		Student s3 = new Student("홍제동",23,50);	
		Student[] friendList = {s1,s2,s3};   //Student들의 집합 / 배열
		Student s4 = new Student("소재휘",50,23,friendList);	//매개변수가 4개인 생성자로 객체 생성
		s4.introduce();
		
	}

}

