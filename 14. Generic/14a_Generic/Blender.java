package Generic;

import java.util.ArrayList;

/*
 Generic : 여러 참조 자료형이 쓰일 수 있는 곳에 특정한 자료형을 지정하지 않고 클래스나 메서드를 정의한다.
 그 후에 사용하는 시점에서 어떤 자료형을 사용할 것인지 지정하는 방식
 Object 클래스로도 구현할 수 있지만 다시 원래 자료형으로 반환해 주기 위해 일일이 형 변환을 해 줘야 한다. 그래서 Generic type을 사용한다.
 */

//Class 설명 
//Blender, FoodBlender : 제네릭 클래스 // Drink : 제네릭 메서드 //Food > Banana,Strawberry / Plastic : 자료형

//Generic class 정의. <fruit>는 자료형 매개변수이다. 나중에 클래스를 사용할 때에 실제 사용할 자료형을 지정해준다.
public class Blender<fruit> {//fruit는 컴파일 할 때 Object 클래스로 변환된다.
	public fruit material; 	//Blender에서는 extends로 자료형의 제한을 두지 않았다. 따라서 material은 Object클래스가 기본으로 제공하는 메서드만 사용할 수 있다.
	public void setMaterial(fruit material) {
		this.material=material;
	}

	public String shake() {
		return material.toString();
	}
	public fruit getMaterial() {
		return material;
	}
	
	public static void main(String[] args) {
		Blender<Banana> b1 = new Blender<Banana>();//fruit의 자료형이 정해지는 순간 : 제네릭 클래스의 인스턴스가 생성되는 순간, 이 때 <>에 자료형을 지정해준다.
		b1.setMaterial(new Banana());	//Blender<Banana> 명칭: 제네릭 자료형
		System.out.println(b1.shake());
		Blender<Strawberry> b2 = new Blender<>(); //선언된 자료형을 보고 컴파일러가 판단 가능. 생성자의 자료형을 명시해 주지 않아도 된다.
		b2.setMaterial(new Strawberry());
		Strawberry s = b2.getMaterial(); //형 변환을 해 주지 않아도 된다.
		System.out.println(b2.shake());
		
		Blender<Object> b3 = new Blender<Object>(); //여러가지 자료형을 동시에 사용하려면 Object 클래스를 사용할 수 있다.
		b3.setMaterial(new Banana());
		System.out.println(b3.shake());
		b3.setMaterial(new Strawberry());
		Strawberry s1 = (Strawberry)b3.getMaterial();	//Object형이기에 형 변환이 필요하다.
		System.out.println(b3.shake());
		b3.setMaterial(new Plastic());
		System.out.println(b3.shake());
		
		FoodBlender<Strawberry> b4 = new FoodBlender<Strawberry>();
		//Blender에서는 extends로 자료형의 제한을 두지 않았다. 따라서 material은 Object클래스가 기본으로 제공하는 메서드만 사용할 수 있다.		

		b4.setMaterial(new Strawberry());
		//FoodBlender<Plastic> b4 = new FoodBlender<Plastic>(); 
		//Plastic형을 사용하면 오류 발생. FoodBlender에서 <T extends 클래스>를 통하여 사용 가능한 자료형에 제한을 두었다.
		b4.slicing();
		//FoodBlender에서는 extends로 자료형의 제한을 두었다. 따라서 material은 Food클래스의 메서드를 사용할 수 있다.
		
		
		//제네릭 메서드 활용
		Drink d1 = new Drink(); 
		d1.makeDrink(b2); //제네릭 자료형 Blender<Strawberry>를 매개변수로 넘겨줌
		
		
		//컬렉션 프레임워크에서의 제네릭
		ArrayList<String> arr = new ArrayList<>(); //Arraylist와 같이 다양한 자료형을 관리하기 위해서 Generic을 통해서 생성한다.

	}

}
