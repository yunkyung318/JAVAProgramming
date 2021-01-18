// 11-2
import java.awt.*;
import javax.swing.*;

public class LableEx extends JFrame {
	public LableEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel textLabel = new JLabel("한재영 존잘");

		ImageIcon beauty = new ImageIcon("C:/JAVA/pic/JaeYong.jpg");
		JLabel imageLabel = new JLabel(beauty);

		ImageIcon normalIcon = new ImageIcon("C:/JAVA/pic/DogHae.jpg");
		JLabel label = new JLabel("동해 존귀", normalIcon, SwingConstants.CENTER);

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
