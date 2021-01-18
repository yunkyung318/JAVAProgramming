// 11-10
import java.awt.*;
import javax.swing.*;

public class ListEx extends JFrame{
	private String[] fruits= {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
	private ImageIcon[] images= {
			new ImageIcon("C:/JAVA/pic/Apple.jpg"),
			new ImageIcon("C:/JAVA/pic/Pear.jpg"),
			new ImageIcon("C:/JAVA/pic/Cherry.jpg"),
			new ImageIcon("C:/JAVA/pic/Check.jpg")
	};
	public ListEx() {
		setTitle("리스트 민들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList=new JList<String>(fruits);
		c.add(strList);
		
		JList<ImageIcon> imageList=new JList<ImageIcon>();
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList=new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		
		setSize(450,450);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();
	}

}
