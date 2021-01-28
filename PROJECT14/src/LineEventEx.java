// 14-13
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.sound.sampled.*;

public class LineEventEx extends JFrame {
	private Clip clip;
	private String song = "audio/애국가 1절.wav";
	private JLabel label = new JLabel(song);

	public LineEventEx() {
		setTitle("애국가 1절 연주");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.YELLOW);
		c.add(label);
		setSize(300, 150);
		setVisible(true);
		loadAudio(song);
	}

	private void loadAudio(String pathName) {
		try {
			File audioFile = new File(pathName);
			final AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			clip = AudioSystem.getClip();
			clip.addLineListener(new LineListener() {
				public void update(LineEvent e) {
					if (e.getType() == LineEvent.Type.STOP) {
						try {
							getContentPane().setBackground(Color.ORANGE);
							label.setText(song + "연주 끝!");
							audioStream.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			});
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new LineEventEx();
	}

}
