// 11-13
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ComboActionEx extends JFrame{
	private String[] fruits= {"apple","banana","pear","mango"};
	private ImageIcon[] images= {
			new ImageIcon("C:/JAVA/pic/Apple.jpg"),
			new ImageIcon("C:/JAVA/pic/Banana.jpg"),
			new ImageIcon("C:/JAVA/pic/Pear.jpg"),
			new ImageIcon("C:/JAVA/pic/Mango.jpg"),
	};
	
	private JLabel imageLabel=new JLabel(images[0]);
	private JComboBox<String> strCombo=new JComboBox<String>(fruits);
	
	public ComboActionEx() {
		setTitle("�޺��ڽ� Ȱ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imageLabel);
		
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb=(JComboBox<String>)e.getSource();
				int index=cb.getSelectedIndex();
				imageLabel.setIcon(images[index]);
			}
		});
		
		setSize(350,350);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboActionEx();
	}

}
