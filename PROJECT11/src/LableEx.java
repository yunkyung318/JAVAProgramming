// 11-2
import java.awt.*;
import javax.swing.*;

public class LableEx extends JFrame {
	public LableEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel textLabel = new JLabel("���翵 ����");

		ImageIcon beauty = new ImageIcon("C:/JAVA/pic/JaeYong.jpg");
		JLabel imageLabel = new JLabel(beauty);

		ImageIcon normalIcon = new ImageIcon("C:/JAVA/pic/DogHae.jpg");
		JLabel label = new JLabel("���� ����", normalIcon, SwingConstants.CENTER);

		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);

		setSize(400, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LableEx();
	}

}
