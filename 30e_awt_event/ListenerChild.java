package ex3_awt_event;

import java.awt.event.WindowEvent;

public class ListenerChild extends ListenerAll{
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}
