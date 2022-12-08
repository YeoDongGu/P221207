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

public class Calculator extends WindowAdapter implements ActionListener {
	private double tmp = 0;
	private int plus = 0;
	private int minus = 0;
	private int mul = 0;
	private int div = 0;
	private int pointcount = 0;
	private Font font1, font2;
	private Frame bg;
	private Panel p;

	private TextField result;
	private String[] op = { ".", "C", "/", "Back", "7", "8", "9", "x", "4", "5", "6", "+", "1", "2", "3", "-", "+-",
			"0", "00", "=" };
	private Button[] bt;

	public Calculator() {
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
		// =====================================================
		// 번호입력
		//소수점 버튼 눌렀을때
		if (pointcount == 0) {
			if (e.getActionCommand().equals("1")) {
				Long number = Long.parseLong(result.getText());
				number = number * 10 + 1;
				String str = String.valueOf(number);
				result.setText(str);
			} else if (e.getActionCommand().equals("2")) {
				Long number = Long.parseLong(result.getText());
				number = number * 10 + 2;
				String str = String.valueOf(number);
				result.setText(str);
			} else if (e.getActionCommand().equals("3")) {
				Long number = Long.parseLong(result.getText());
				number = number * 10 + 3;
				String str = String.valueOf(number);
				result.setText(str);
			} else if (e.getActionCommand().equals("4")) {
				Long number = Long.parseLong(result.getText());
				number = number * 10 + 4;
				String str = String.valueOf(number);
				result.setText(str);
			} else if (e.getActionCommand().equals("5")) {
				Long number = Long.parseLong(result.getText());
				number = number * 10 + 5;
				String str = String.valueOf(number);
				result.setText(str);
			} else if (e.getActionCommand().equals("6")) {
				Long number = Long.parseLong(result.getText());
				number = number * 10 + 6;
				String str = String.valueOf(number);
				result.setText(str);
			} else if (e.getActionCommand().equals("7")) {
				Long number = Long.parseLong(result.getText());
				number = number * 10 + 7;
				String str = String.valueOf(number);
				result.setText(str);
			} else if (e.getActionCommand().equals("8")) {
				Long number = Long.parseLong(result.getText());
				number = number * 10 + 8;
				String str = String.valueOf(number);
				result.setText(str);
			} else if (e.getActionCommand().equals("9")) {
				Long number = Long.parseLong(result.getText());
				number = number * 10 + 9;
				String str = String.valueOf(number);
				result.setText(str);
			} else if (e.getActionCommand().equals("0")) {
				Long number = Long.parseLong(result.getText());
				number = number * 10;
				String str = String.valueOf(number);
				result.setText(str);
			} else if (e.getActionCommand().equals("00")) {
				Long number = Long.parseLong(result.getText());
				number = number * 100;
				String str = String.valueOf(number);
				result.setText(str);
			}
		} else { // 소수점이 아닐때
			if (e.getActionCommand().equals("1")) {
				int num = 1;
				for (int i = 0; i < pointcount; i++) {
					num *= 10;
				}
				double number = Double.parseDouble(result.getText());
				number = number + (double) 1 / num;
				String str = String.valueOf(number);
				result.setText(str);
				pointcount++;
			} else if (e.getActionCommand().equals("2")) {
				int num = 1;
				for (int i = 0; i < pointcount; i++) {
					num *= 10;
				}
				double number = Double.parseDouble(result.getText());
				number = number + (double) 2 / num;
				String str = String.valueOf(number);
				result.setText(str);
				pointcount++;
			} else if (e.getActionCommand().equals("3")) {
				int num = 1;
				for (int i = 0; i < pointcount; i++) {
					num *= 10;
				}
				double number = Double.parseDouble(result.getText());
				number = number + (double) 3 / num;
				String str = String.valueOf(number);
				result.setText(str);
				pointcount++;
			} else if (e.getActionCommand().equals("4")) {
				int num = 1;
				for (int i = 0; i < pointcount; i++) {
					num *= 10;
				}
				double number = Double.parseDouble(result.getText());
				number = number + (double) 4 / num;
				String str = String.valueOf(number);
				result.setText(str);
				pointcount++;
			} else if (e.getActionCommand().equals("5")) {
				int num = 1;
				for (int i = 0; i < pointcount; i++) {
					num *= 10;
				}
				double number = Double.parseDouble(result.getText());
				number = number + (double) 5 / num;
				String str = String.valueOf(number);
				result.setText(str);
				pointcount++;
			} else if (e.getActionCommand().equals("6")) {
				int num = 1;
				for (int i = 0; i < pointcount; i++) {
					num *= 10;
				}
				double number = Double.parseDouble(result.getText());
				number = number + (double) 6 / num;
				String str = String.valueOf(number);
				result.setText(str);
				pointcount++;
			} else if (e.getActionCommand().equals("7")) {
				int num = 1;
				for (int i = 0; i < pointcount; i++) {
					num *= 10;
				}
				double number = Double.parseDouble(result.getText());
				number = number + (double) 7 / num;
				String str = String.valueOf(number);
				result.setText(str);
				pointcount++;
			} else if (e.getActionCommand().equals("8")) {
				int num = 1;
				for (int i = 0; i < pointcount; i++) {
					num *= 10;
				}
				double number = Double.parseDouble(result.getText());
				number = number + (double) 8 / num;
				String str = String.valueOf(number);
				result.setText(str);
				pointcount++;
			} else if (e.getActionCommand().equals("9")) {
				int num = 1;
				for (int i = 0; i < pointcount; i++) {
					num *= 10;
				}
				double number = Double.parseDouble(result.getText());
				number = number + (double) 9 / num;
				String str = String.valueOf(number);
				result.setText(str);
				pointcount++;
			} else if (e.getActionCommand().equals("0")) {
				pointcount++;
			} else if (e.getActionCommand().equals("00")) {
				pointcount += 2;
			}
		}

		// ===========================================================
		// 특수기능
		if (e.getActionCommand().equals("C")) {
			result.setText("0");
			tmp = 0;
			plus = 0;
			minus = 0;
			mul = 0;
			div = 0;

			pointcount = 0;
		}

		if (e.getActionCommand().equals("Back")) {
			Long number = Long.parseLong(result.getText());
			number = number / 10;
			String str = String.valueOf(number);
			result.setText(str);
		}
		if (e.getActionCommand().equals(".")) {
			pointcount++;
		}
		// ============================================================
		// 연산기능
		if (e.getActionCommand().equals("+")) {
			plus++;
			double number = Double.parseDouble(result.getText());
			tmp = number;
			result.setText("0");
			pointcount = 0;
		} else if (e.getActionCommand().equals("-")) {
			minus++;
			double number = Double.parseDouble(result.getText());
			tmp = number;
			result.setText("0");
			pointcount = 0;
		} else if (e.getActionCommand().equals("x")) {
			mul++;
			double number = Double.parseDouble(result.getText());
			tmp = number;
			result.setText("0");
			pointcount = 0;
		} else if (e.getActionCommand().equals("/")) {
			div++;
			double number = Double.parseDouble(result.getText());
			tmp = number;
			result.setText("0");
			pointcount = 0;
		}

		if (e.getActionCommand().equals("=")) {
			if (plus != 0) {
				Double number = Double.parseDouble(result.getText());
				String str = String.valueOf(tmp + number);
				System.out.println(tmp + number);
				result.setText(str);
				plus = 0;
			} else if (minus != 0) {
				Double number = Double.parseDouble(result.getText());
				String str = String.valueOf(tmp - number);
				System.out.println(tmp - number);
				result.setText(str);
				minus = 0;
			} else if (mul != 0) {
				Double number = Double.parseDouble(result.getText());
				String str = String.valueOf(tmp * number);
				System.out.println(tmp * number);
				result.setText(str);
				mul = 0;
			} else if (div != 0) {
				Double number = Double.parseDouble(result.getText());
				String str = String.valueOf(tmp / number);
				System.out.println(tmp / number);
				result.setText(str);
				div = 0;
			}

		}

	} //

	public static void main(String[] args) {
		Calculator cc = new Calculator();
		cc.startframe();
	}

}
