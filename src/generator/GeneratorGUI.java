package generator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GeneratorGUI {

	String font = "Bahnschrift";

	public GeneratorGUI() {

		// Border Defaults
		Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 10);

		// Label Defaults
		JLabel label = new JLabel();
		label.setText("Test");
		label.setBounds(100, 50, 150, 100);

		// Frame Defaults
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(1280, 720);
		frame.setTitle("Mod Items Generator by Cecep");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		// Add Labels
		frame.add(label);
		label.setForeground(Color.BLACK);
		label.setFont(new Font(font, Font.PLAIN, 25));
		label.setBorder(border);
		label.setHorizontalAlignment(JLabel.CENTER);

		// Icon Defaults
		ImageIcon icon = new ImageIcon("logo.png");
		frame.setIconImage(icon.getImage());

		// Background Defaults
		frame.getContentPane().setBackground(Color.GRAY);

	}

	public static void main(String[] args) {
		new GeneratorGUI();
	}

}
