package ex1_frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class MyFrame {

	public static void main(String[] args) {

		Frame frame = new Frame("문장입력기");
		frame.setBounds(800, 100, 250, 400);
		frame.setBackground(Color.CYAN);

		//폰트
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);

		//-------------북쪽단-----------------
		Panel pNorth = new Panel();
		pNorth.setBackground(Color.GREEN);

		//TextField tf = new TextField("안녕", 15);//입력상자의 길이
		TextField tf = new TextField(15);
		Button btn = new Button("입력");
		btn.setEnabled(false);//버튼 비활성화
		//pNorth패널에 tf, btn을 추가
		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);

		//-------------중앙단--------------
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setEditable(false);//ta의 임의수정 불가
		ta.setFont(font);

		//-------------남쪽단--------------
		Panel pSouth = new Panel();
		pSouth.setBackground(Color.MAGENTA);
		Button btnSave = new Button("저장");
		Button btnClose = new Button("닫기");
		pSouth.add(btnSave);
		pSouth.add(btnClose);

		//프레임을 통해 각각의 패널 컴포넌트를 배치
		frame.add(pNorth, BorderLayout.NORTH);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(pSouth, BorderLayout.SOUTH);

		//TextField에 값이 들어가있는 경우에만 입력버튼을 활성화
		tf.addTextListener( new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {

				//tf에 한글자라도 입력이 되어있는 경우
				if( tf.getText().trim().equals("") ) {
					btn.setEnabled(false);//입력버튼 비활성화
				}else {
					btn.setEnabled(true);//입력버튼 활성화
				}

			}
		} );
		
		//입력 버튼을 클릭하면 TextArea에 내용을 추가
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//ta.setText( tf.getText().trim() );
				ta.append( tf.getText().trim() + "\n" );
				
				//tf를 비워주고, 포커스를 이동
				tf.setText("");
				tf.requestFocus();//tf로 포커스 이동
			}
		});

		//엔터값을 통해 ta에 데이터 추가
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if( e.getKeyChar() == KeyEvent.VK_ENTER ) {
					
					ta.append( tf.getText().trim() + "\n" );
					
					//tf를 비워주고, 포커스를 이동
					tf.setText("");
					tf.requestFocus();//tf로 포커스 이동
					
				}
				
			}
		});
		
		//닫기버튼 클릭시 프로그램 종료
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	
				System.exit(0);
			}
		});
		
		//저장버튼 클릭시 내용을 txt문서로 기록
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText().trim();
				
				FileWriter fw = null;
				BufferedWriter bw = null;
				
				try {
					//저장경로 잡아주기
					FileDialog fd = new FileDialog(frame, "저장하기");
					fd.setVisible(true);
					
					//System.out.println(fd.getDirectory() + fd.getFile());
					String path = fd.getDirectory() + fd.getFile();
					if( !message.equals("") ) {
						//ta에 저장할 내용이 있는 경우
						fw = new FileWriter(path);
						bw = new BufferedWriter(fw);
						
						bw.write(message);
						
						if( fd.getFile() == null ) {
							JOptionPane.showMessageDialog(
									frame, "저장취소");
						}else {
							JOptionPane.showMessageDialog(
									frame, "저장이 완료 되었습니다");
							
						}						
						
					}else {
						//ta에 저장할 내용이 없다면
						JOptionPane.showMessageDialog(
								frame, "내용이 없으면 저장 할 수 없습니다");
						
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
				} finally {
					
					try {
						bw.close();
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			}
		});
		
		//프레임 사이즈 불가
		frame.setResizable(false);
		frame.setVisible(true);

		//종료
		frame.addWindowListener( new WindowAdapter() {	
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		} );

	}//main
}









