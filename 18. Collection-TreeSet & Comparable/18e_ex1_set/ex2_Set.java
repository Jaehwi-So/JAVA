package ex3_collection;

import java.util.Random;
import java.util.TreeSet;

public class ex2_Set {
	
	public static void main(String[] args) {
		
		/* TreeSet : 중복 허용 안함. 오름차순 정렬 제공 */
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		while(ts.size() < 6) {
			int r = new Random().nextInt(45)+1;
			ts.add(r);	//자동으로 정렬, 중복 제거
		}
		
		System.out.println(ts);
		System.out.println(ts.subSet(10, 30));	//TreeSet의 10~30 범위의 원소들의 부분집합.
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("bbb");
		ts2.add("ccc");
		ts2.add("박길동");
		ts2.add("홍길동");
		ts2.add("김길동");
		ts2.add("aaa");
		System.out.println(ts2);

	}

}
