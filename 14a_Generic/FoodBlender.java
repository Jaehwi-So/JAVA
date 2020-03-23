package Generic;

public class FoodBlender<fruit extends Food> { //fruit 자료형에 사용할 수 있는 자료형을 Food로 제한하였다. 컴파일 시 fruit는 Food형으로 변환된다.
	//FoodBlender에서는 extends로 자료형의 제한을 두었다. 따라서 material은 Food클래스의 메서드를 사용할 수 있다.
	public fruit material;
	public void setMaterial(fruit material) {
		this.material=material;
	}	

	public String shake() {
		return material.toString();
	}
	
	public void slicing() {
		material.slice();
	}
}
