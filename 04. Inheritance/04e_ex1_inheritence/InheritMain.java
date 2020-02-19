package ex1_inheritence;

public class InheritMain {
	public static void main(String[] args) {
		//자바는 단일상속 개념으로서 하나의 자식이 여러개의 부모를 동시에 상속받을 수 없다.
		//부모 클래스는 여러개의 자식 클래스를 가질 수 있다. 반면 자식 클래스는 둘 이상의 부모 클래스를 가질 수 없다.
		
		Child c = new Child();	//스택 영역에 c가 만들어지고 힙 영역에 부모 클래스 Parent가 만들어진 후 자식 클래스 Child가 만들어진다. 
		//왼쪽의 객체와 오른쪽 클래스의 인스턴스가 같다는 의미는 상속 관계에 있다는 의미이다.
		if(c instanceof Parent) {
			System.out.println("같은 인스턴스. 상속 관계");
		}	
		
		if(c instanceof Object) {	//자바에 존재하는 모든 클래스는 Object 클래스의 자식이다.
			System.out.println("같은 인스턴스. 상속 관계");
		}		
		System.out.println(c.car);
		System.out.println(c.money);	//상속관계에 있는 부모의 속성과 메서드를 자식 클래스에서 사용할 수 있다.
		System.out.println(c.house);
		
		Parent p = new Parent();
		//System.out.println(p.car); 상속관계일지라도 부모 클래스에서 자식 클래스의 속성이나 메서드로 마음대로 접근할 수 없다.


	}
}
