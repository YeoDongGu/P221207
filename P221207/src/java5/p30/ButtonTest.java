package java5.p30;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest extends WindowAdapter implements ActionListener {
	private Frame f;
	private Button btn1;

	public ButtonTest() {
		f = new Frame("Login");
		btn1 = new Button("확인");
	}

	public void startframe() {
		f.addWindowListener(this);
		f.setSize(300, 200);
		f.setLayout(null);

		btn1.addActionListener(this);
		btn1.setSize(100, 50);
		btn1.setLocation(100, 75);
		f.add(btn1);
		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (btn1.getLabel().equals("확인")) {
			btn1.setLabel("취소");
		} else {
			btn1.setLabel("확인");
		}

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	public static void main(String[] args) {
		ButtonTest bt = new ButtonTest();
		bt.startframe();
	}

}
