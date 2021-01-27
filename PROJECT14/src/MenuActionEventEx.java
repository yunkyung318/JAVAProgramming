// 14-2
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuActionEventEx extends JFrame{
	private JLabel imgLabel=new JLabel();
	public MenuActionEventEx() {
		setTitle("Menu에 Action 리스너 만들기 예제");
		creatMenu();
		getContentPane().add(imgLabel,BorderLayout.CENTER);
		setSize(250,220);
		setVisible(true);
	}
	
	private void creatMenu() {
		JMenuBar mb=new JMenuBar();
		JMenuItem[] menuItem=new JMenuItem[4];
		String[] itemTitle= {"Load","Hide","ReShow","Exit"};
		JMenu screenMenu=new JMenu("Screen");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
