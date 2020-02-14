package ex1_construct;

public class ConstructorMain {
	
	public static void main(String[] args) {
		MakeConstructor c1 = new MakeConstructor();
		//스택 영역에 c1이 할당되고 new를 통해서 힙 영역에 할당할 준비를 한다. 그리고 생성자를 통해서 힙 영역에 할당이 된다.
		c1.num=10;	//힙 영역에 할당된 인스턴스의 num에 10을 넣는다.
	}

}
