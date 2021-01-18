// 11-15
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderChangeEx extends JFrame {
	private JLabel colorLabel;
	private JSlider[] s1 = new JSlider[3];

	public SliderChangeEx() {
		setTitle("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		colorLabel = new JLabel("        SLIDER EXAMPLE        ");

		for (int i = 0; i < s1.length; i++) {
			s1[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);

			s1[i].setPaintLabels(true);
			s1[i].setPaintTicks(true);
			s1[i].setPaintTrack(true);
			s1[i].setMajorTickSpacing(50);
			s1[i].setMinorTickSpacing(10);

			s1[i].addChangeListener(new MyChangeListener());
			c.add(s1[i]);
		}

		s1[0].setForeground(Color.RED);
		s1[1].setForeground(Color.GREEN);
		s1[2].setForeground(Color.BLUE);

		int r = s1[0].getValue();
		int g = s1[1].getValue();
		int b = s1[2].getValue();
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r, g, b));

		c.add(colorLabel);
		setSize(300, 230);
		setVisible(true);
	}

	class MyChangeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			int r = s1[0].getValue();
			int g = s1[1].getValue();
			int b = s1[2].getValue();
			colorLabel.setBackground(new Color(r, g, b));
		}
	}

	public static void main(String[] args) {
		new SliderChangeEx();
	}

}
