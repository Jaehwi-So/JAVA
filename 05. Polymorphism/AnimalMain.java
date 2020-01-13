package polymorphism;

/*
 다형성
 이름이 같은 매서드 하나가 서로 다른 역할을 구현할 수 있는 것.
 상위 클래스에서 공통 부분의 메서드를 제공하고 하위 클래스에서 그에 기반한 추가 요소를 덧붙여 구현한다면 코드의 양도 줄어들고 유지보수도 편리하다.
 상속받은 클래스들을 하나의 상위 클래스로 처리할 수 있으며 그에 맞추어 다양하게 구현할 수 있으므로 확장성이 좋다.
 */
public class AnimalMain {
	
	public void moveAnimal(Animal animal) { //Animal에서 상속받은 클래스가 매개변수로 넘어오면  Animal형으로 변환된다.어떤 매개변수가 넘어왔느냐에 따라서 출력 결과가 달라짐
		animal.move(); //animal.move() 메서드가 호출하는 메서드는 매개변수로 넘어온 실제 인스턴스의 메서드이다.
	}
	
	public void eatAnimal(Animal animal) {
		animal.eat();
	}
	
	//다운 캐스팅(instanceof) : 상위 클래스를 자료형으로 선언한 경우 하위 클래스의 매서드를 사용할 수 없는 경우가 있다. 필요에 따라서 원래 인스턴스의 자료형으로 되돌아 가야 하는 경우 다운 캐스팅 한다.
	public void downCast(Animal animal) {
		if(animal instanceof Tiger) {
			Tiger t = (Tiger)animal;
			t.hunt();
		}
		else if(animal instanceof Rabbit) {
			Rabbit r = (Rabbit)animal;
			r.hide();
		}
	}
	
	public static void main(String[] args) {
		AnimalMain a1 = new AnimalMain();
		Animal t1 = new Tiger(); //생성된 인스턴스 Tiger
		Animal r1 = new Rabbit();
		Tiger t2 = new Tiger();
		a1.moveAnimal(new Tiger()); //하나의 함수로 자료형에 따라서 다른 인스턴스를 실행시킬 수 있다.
		a1.moveAnimal(new Rabbit());
		a1.moveAnimal(t2);
		a1.eatAnimal(t1);
		a1.eatAnimal(r1);
		
		t2.hunt();
		//t1.hunt(); = 오류발생. 왜냐하면 t1의 자료형은 Animal이기 때문에 Tiger클래스의 hunt를 사용할 수 없다.
		a1.downCast(new Tiger());
		a1.downCast(r1);
		a1.downCast(t1);

	}

}
