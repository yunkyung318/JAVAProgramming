// 14-4
import javax.swing.*;
import java.awt.*;

public class ToolTipEx extends JFrame{
	private Container contentPane;
	
	public ToolTipEx() {
		setTitle("툴팁 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		createToolBar();
		setSize(400,150);
		setVisible(true);
	}
	
	private void createToolBar() {
		JToolBar bar=new JToolBar("kitae Menu");
		bar.setBackground(Color.LIGHT_GRAY);
		
		JButton newBtn=new JButton("New");
		newBtn.setToolTipText("파일을 생성합니다.");
		bar.add(newBtn);
		
		JButton openBtn=new JButton(new ImageIcon("C:/JAVA/pic/Banana.jpg"));
		openBtn.setToolTipText("파일을 엽니다.");
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn=new JButton(new ImageIcon("C:/JAVA/pic/Apple.jpg"));
		saveBtn.setToolTipText("파일을 저장합니다.");
		bar.add(saveBtn);
		bar.add(new JLabel("search"));
		
		JTextField tf=new JTextField("text field");
		tf.setToolTipText("찾고자하는 문자열을 입력하세요");
		bar.add(tf);
		contentPane.add(bar,BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		new ToolTipEx();
	}

}
