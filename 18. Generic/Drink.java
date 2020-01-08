package Generic;

//제네릭 메서드 Drink
public class Drink {
	public<fruit> void makeDrink(Blender<fruit> b1) {  //제네릭 메서드
		System.out.println(b1.shake()+ " 우유를 섞어 음료를 완성했습니다.");
	}

}
