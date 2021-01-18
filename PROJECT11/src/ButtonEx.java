// 11-3
import java.awt.*;
import javax.swing.*;

public class ButtonEx extends JFrame{
	public ButtonEx() {
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon=new ImageIcon("C:/JAVA/pic/CallNomal1.jpg");
		ImageIcon rolloverIcon=new ImageIcon("C:/JAVA/pic/Call1.jpg");
		ImageIcon pressedIcon=new ImageIcon("C:/JAVA/pic/CallMouse1.jpg");
		
		JButton btn=new JButton("Call~~",normalIcon);
		JButton btns=new JButton("sibar~",normalIcon);
		
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		c.add(btns);
		setSize(350,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();
		
	}

}
