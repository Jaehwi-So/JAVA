package ex2_wordgame;

import java.util.ArrayList;
public class Quiz {
	
	ArrayList<String> arr = new ArrayList<>();
	
	void quiz_run() {
		
		QuizThread qt = new QuizThread();
		Thread t = new Thread(qt);
		t.start();
		
	}

}
