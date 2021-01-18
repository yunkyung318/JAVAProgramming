// 11-8
import java.awt.*;
import javax.swing.*;

public class TextFieldEx extends JFrame{
	public TextFieldEx() {
		setTitle("텍스트 필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 "));
		c.add(new JTextField(20));
		c.add(new JLabel("학과 "));
		c.add(new JTextField("컴퓨터소프트웨어공학과",20));
		c.add(new JLabel("주소 "));
		c.add(new JTextField("경기도 ...",20));
		
		setSize(280,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
