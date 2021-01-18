// 11-7
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonItemEventEx extends JFrame{
	private JRadioButton[] radio=new JRadioButton[3];
	private String[] text= {"���","��","ü��"};
	private ImageIcon[] image= {
			new ImageIcon("C:/JAVA/pic/Apple.jpg"),
			new ImageIcon("C:/JAVA/pic/Pear.jpg"),
			new ImageIcon("C:/JAVA/pic/Cherry.jpg")
	};
	private JLabel imageLabel=new JLabel();
	
	public RadioButtonItemEventEx() {
		setTitle("���� ��ư Item Event ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel radioPanel=new JPanel();
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g=new ButtonGroup();
		for(int i=0;i<radio.length;i++) {
			radio[i]=new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		radio[2].setSelected(true);
		c.add(radioPanel,BorderLayout.NORTH);
		c.add(imageLabel,BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(350,250);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.DESELECTED)
				return;
			if(radio[0].isSelected())
				imageLabel.setIcon(image[0]);
			if(radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			if(radio[2].isSelected())
				imageLabel.setIcon(image[2]);
		}
	}
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}

}
