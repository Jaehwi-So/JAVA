package classxx;

public class Man {
	public String name;
	public int age;
	public String sex = "male";
	public Man(String name, int age){
		this.name=name;
		this.age=age;
	};
	public Man(int age){
		this.age=age;
	};
	public Man(){};
	
	public String getSex() {
		return sex;
	}
	
}