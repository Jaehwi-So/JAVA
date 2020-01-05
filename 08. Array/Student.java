package array;

public class Student {
	public String name;
	public int age;
	
	Student(String name, int age){
		this.name=name;
		this.age=age;		
	};
	
	Student(){};
	
	void printInfo() {
		System.out.printf("이름 : %s, 나이 : %d \n",name,age);		
	}
	


}