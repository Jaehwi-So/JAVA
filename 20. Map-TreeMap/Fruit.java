package treemap;

public class Fruit implements Comparable<Fruit> {
	String name;
	String origin;
	Fruit(String s1, String s2){
		this.name=s1;
		this.origin=s2;
	}
	
	@Override //compareTo를 재정의하여 정렬 기준을 만들었다.
	public int compareTo(Fruit f) {
		return name.compareTo(f.name);
	}

}

