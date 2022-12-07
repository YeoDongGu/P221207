package java5.p20;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderTest {
	private Frame f;
	private Button[] btn;

	public BorderTest() {
		f = new Frame("event handler example");
		Button[] btn = new Button[5];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button("Button" + (i + 1));
		}
		this.btn = btn;
	}

	public class InnerHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Button1")) {
				System.out.println("Button 1 Click!");
			}
			if (e.getActionCommand().equals("Button2")) {
				System.out.println("Button 2 Click!");
			}
			if (e.getActionCommand().equals("Button3")) {
				System.out.println("Button 3 Click!");
			}
			if (e.getActionCommand().equals("Button4")) {
				System.out.println("Button 4 Click!");
			}
			if (e.getActionCommand().equals("Button5")) {
				System.out.println("Button 5 Click!");
			}
		}
	}

	public void startFrame() {
		for (int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(new InnerHandler());
		}

		f.add(btn[0], "North");
		f.add(btn[1], "South");
		f.add(btn[2], "West");
		f.add(btn[3], "East");
		f.add(btn[4], "Center");

		f.setSize(300, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		BorderTest border = new BorderTest();
		border.startFrame();
	}

}
