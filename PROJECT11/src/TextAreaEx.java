// 11-9
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaEx extends JFrame{
	private JTextField tf=new JTextField(20);
	private JTextArea ta=new JTextArea(7,20);
	
	public TextAreaEx() {
		setTitle("�ؽ�Ʈ ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�Է� �� <Enter> Ű�� �Է��ϼ���"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t=(JTextField)e.getSource();
				ta.append(t.getText()+"\n");
				t.setText("");
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}

}
