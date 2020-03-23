package ex2_wordgame;

import java.util.ArrayList;

public class QuizThread implements Runnable{

	boolean clear = false;
	ArrayList<String> arr = new ArrayList<>();

	@Override
	public void run() {
		int rnd;
		while(clear != true) {
			try {
				rnd = (int)((Math.random()*4)+1);
				if(rnd==1) {
					arr.add("apple");
				}
				else if(rnd==2) {
					arr.add("pineapple");
				}
				else if(rnd==3) {
					arr.add("orange");
				}
				else {
					arr.add("grape");
				}
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("clear!!!!");
	}

}