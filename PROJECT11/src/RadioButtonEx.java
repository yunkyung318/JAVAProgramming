// 11-5
import java.awt.*;
import javax.swing.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("������ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon cherryIcon = new ImageIcon("C:/JAVA/pic/Cheery1.jpg");
		ImageIcon CheckIcon = new ImageIcon("C:/JAVA/pic/Check.jpg");
		
		ButtonGroup g=new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��", true);
		JRadioButton cherry = new JRadioButton("ü��", cherryIcon);

		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(CheckIcon);

		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);

		setSize(350, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
