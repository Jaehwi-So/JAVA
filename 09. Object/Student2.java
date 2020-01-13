package objectxx;

public class Student2 implements Cloneable {
	String name;
	int age;
	int ID;
	Student2(String n, int i, int ID){
		this.name=n;
		this.age=i;
		this.ID=ID;
	}
	
	//toString()의 재정의
	@Override
	public String toString() {
		return "이름 : "+name+" 나이 : "+age;
	}
	
	//equals()의 재정의를 통해 name과 age가 같으면 true를 반환하도록 재정의
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student2) {
			Student2 s=(Student2) o;	
			if(s.ID==this.ID) {
				return true;
			}
			else return false;
		}
		return false;
		
	}
	
	//hashCode()의 재정의를 통해서 객체의 메모리 주소값 대신 ID를 반환하도록 하였다. 보통 hashCode()를 재정의 할 때에는 논리적으로 같다는 것을 구현할 때 사용한 멤버 변수를 활용한다.
	@Override
	public int hashCode() {
		return ID;
	}
	
	//clone 메서드를 사용하려면 객체를 복제해도 된다는 implements Cloneable 인터페이스를 구현해야 한다.
	//밑의 재정의는 오류 예외 처리이다.
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
