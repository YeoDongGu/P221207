package Quiz;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends WindowAdapter implements ActionListener {
	private Frame bg;
	private Panel p;
	private TextField result;
	private String[] op = { ".", "C", "/", "Back", "7", "8", "9", "x", "4", "5", "6", "+", "1", "2", "3", "-", "+-",
			"0", "00", "=" };
	private Button[] bt;

	public Calculator() {
		bg = new Frame("Calculator");
		bg.add("South", new Label());
		bg.add("West", new Label());
		bg.add("East", new Label());
		p = new Panel(new GridLayout(5, 4));
		result = new TextField("0");
		bt = new Button[20];
		for (int i = 0; i < bt.length; i++) {
			bt[i] = new Button(op[i]);
		}
	}

	public void startframe() {
		bg.addWindowListener(this);
		for (int i = 0; i < bt.length; i++) {
			bt[i].addActionListener(this);
		}

		bg.add(result, "North");
		bg.setSize(300, 300);
		bg.setVisible(true);
		bg.add(p, BorderLayout.CENTER);
		for (int i = 0; i < bt.length; i++) {
			p.add(bt[i]);
		}

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int plus = 0;
		int minus = 0;
		int mul = 0;
		int div = 0;
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

		if (e.getActionCommand().equals("C")) {
			result.setText("0");
		}

		if (e.getActionCommand().equals("Back")) {
			Long number = Long.parseLong(result.getText());
			number = number / 10;
			String str = String.valueOf(number);
			result.setText(str);
		}

		if (e.getActionCommand().equals("+")) {
			plus++;
		}

	}

	public static void main(String[] args) {
		Calculator cc = new Calculator();
		cc.startframe();
	}

}
