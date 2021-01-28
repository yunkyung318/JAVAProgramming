// 14-3
import javax.swing.*;
import java.awt.*;

public class ToolBarEx extends JFrame{
	private Container contentPane;
	
	public ToolBarEx() {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane=getContentPane();
		createToolBar();
		setSize(400,200);
		setVisible(true);
	}
	
	private void createToolBar() {
		JToolBar toolBar=new JToolBar("Kitae Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("C:/JAVA/pic/Apple.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("C:/JAVA/pic/Banana.jpg")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox<String> combo=new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		
		contentPane.add(toolBar,BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new ToolBarEx();
	}
}
