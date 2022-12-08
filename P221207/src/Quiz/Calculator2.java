package Quiz;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator2 extends WindowAdapter implements ActionListener {
	private double tmp1;
	private double tmp2;
	private char oper;
	private Font font1, font2;
	private Frame bg;
	private Panel p;

	private TextField result;
	private String[] op = { ".", "C", "/", "Back", "7", "8", "9", "x", "4", "5", "6", "+", "1", "2", "3", "-", "+-",
			"0", "00", "=" };
	private Button[] bt;

	public Calculator2() {
		tmp1 = 0;
		tmp2 = 0;
		oper = '\0';
		bg = new Frame("계산기");
		p = new Panel(new GridLayout(5, 4));
		font1 = new Font("f", Font.BOLD, 30);
		font2 = new Font("f", Font.BOLD, 15);

		result = new TextField("0");
		result.setFont(font1);
		bt = new Button[20];
		for (int i = 0; i < bt.length; i++) {
			bt[i] = new Button(op[i]);
			bt[i].setFont(font2);
		}
	}

	public void startframe() {
		bg.addWindowListener(this);
		for (int i = 0; i < bt.length; i++) {
			bt[i].addActionListener(this);
		}

		bg.add(result, "North");
		bg.setSize(300, 300);
		bg.add(p, BorderLayout.CENTER);
		for (int i = 0; i < bt.length; i++) {
			p.add(bt[i]);
		}
		bt[19].setBackground(Color.green);
		bt[3].setBackground(Color.CYAN);
		bg.setVisible(true);
		bt[1].setBackground(Color.gray);

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String act = e.getActionCommand();
		char c = result.getText().charAt(0);
		if (Character.isDigit(act.charAt(0)) == true) { // 버튼이 숫자라면
			if (c == '0') {
				result.setText(act);
			} else {
				String s = result.getText() + act;
				result.setText(s);
			}
		} else { // 버튼이 숫자가 아니라면
			if (act.charAt(0) == '=') { // = 을 입력했을떄
				tmp2 = Integer.parseInt(result.getText());
				double res = 0;
				switch (oper) {
				case '+':
					res = tmp1 + tmp2;
					result.setText(res + "");
					break;
				case '-':
					res = tmp1 - tmp2;
					result.setText(res + "");
					break;
				case '*':
					res = tmp1 * tmp2;
					result.setText(res + "");
					break;
				case '/':
					res = tmp1 / tmp2;
					result.setText(res + "");
					break;
				}
			} else { // = 을제외한 연산자를 입력했을때
				tmp1 = Integer.parseInt(result.getText()); // tmp1 에 이때까지 입력한 수를 저장
				oper = act.charAt(0); // 누른 연산자버튼의 연산자를 oper char 에 저장
				result.setText("0"); // 연산버튼을 눌렀으니 화면 0으로 초기화
			}
		}
	}

	public static void main(String[] args) {
		Calculator cc = new Calculator();
		cc.startframe();
	}

}
