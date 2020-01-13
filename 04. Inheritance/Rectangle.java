package inheritance;

//상위 클래스 Rectangle
public class Rectangle {
	protected double width; //protected는 다른 클래스에서는 사용 불가능하나 하위 클래스인 경우 사용할 수 있음
	protected double length;
	Rectangle(double w, double l){
		width=w;
		length=l;
	}
	Rectangle(){};
	double calcArea() {
		return width*length;
	}
	
	String showInfo() {
		return " 가로 : "+width+" 세로 : "+length;
	}

}
