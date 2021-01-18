// 12-8
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx3 extends JFrame{
	private MyPanel panel=new MyPanel();
	
	public GraphicsDrawImageEx3() {
		setTitle("이미지 일부분을 크기 조절하여 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon=new ImageIcon();
		private Image img=icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img,20,20,250,100,100,50,200,200,this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx3();
	}

}
