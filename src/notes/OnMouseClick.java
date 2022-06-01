package notes;

import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class OnMouseClick {

	public OnMouseClick() {
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("Steal");
		
		frame.addMouseListener(new MouseClicker());
		frame.setSize(1980, 1080);
		frame.setVisible(false);
		
	}

}

class MouseClicker extends MouseAdapter {

	boolean alpha;

	@Override
	public void mouseClicked(MouseEvent e) {
		if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
			System.out.println("LMao");
		} 
	}
}