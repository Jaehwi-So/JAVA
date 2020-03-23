package ex2_image;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImageTest {
	public static void main(String[] args) {

		Frame f = new Frame("이미지 테스트");
		f.setLayout(null);
		
		f.setBounds(600, 200, 700, 438);
		
		//버튼
		JButton btn = new JButton(new ImageIcon("img.jpg"));
		btn.setBounds(10, 40, 100, 50);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//이미지
		ImageIcon img = new ImageIcon("img.jpg");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 700, 438);
		
		
		f.add(btn);
		f.add(jl);
		
		
		
		f.setResizable(true);
		f.setVisible(true);
		
		//종료
		f.addWindowListener( new WindowAdapter() {	
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		} );

	}
}