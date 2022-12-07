package java5.p40;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldTest extends WindowAdapter implements ActionListener {
	private final String MYPWD = "ehdrn1";
	private final String MYID = "nanovia3";
	private Frame f;
	private Label lid;
	private Label lpwd;
	private TextField id;
	private TextField pwd;
	private TextField result;
	private Button log;

	public TextFieldTest() {
		f = new Frame("Login");
		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("password : ", Label.RIGHT);

		id = new TextField(10);
		pwd = new TextField(10);
		result = new TextField(40);
		result.setEditable(false);
		result.setFocusable(false);
		log = new Button("로그인");
	}

	public void startframe() {
		f.setSize(400, 100);
		f.setLayout(new FlowLayout());

		f.addWindowListener(this);
		log.addActionListener(this);
		pwd.setEchoChar('*');

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(log);
		f.add(result);
		f.setVisible(true);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		BorderTest bt = new BorderTest();
		if (e.getActionCommand().equals("로그인")) {
			if (id.getText().equals(MYID) && pwd.getText().equals(MYPWD)) {
				result.setText("로그인에 성공하셨습니다.");
				bt.startFrame();
				f.setVisible(false);
			} else {
				result.setText("아이디 혹은 비밀번호가 틀렸습니다.");
			}
		}

	}

	public static void main(String[] args) {
		TextFieldTest tf = new TextFieldTest();
		tf.startframe();

	}

}
