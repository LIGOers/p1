import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseClickTest implements MouseListener{
	private JFrame root;
	private Button button;
	public static void main(String[] args){
		new MouseClickTest();
	}
	
	public void ConstructUI(){
		root = new JFrame();
		root.setVisible(true);
		root.setSize(800, 800);
		JButton button = new JButton("test");
		root.setLayout(new BorderLayout());
		root.add(button);
	}
	//class constructor
	public MouseClickTest(){
		ConstructUI();
	}

	//mouse click methods
	@Override
	public void mouseClicked(MouseEvent arg0) {}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {}
	@Override
	public void mouseReleased(MouseEvent arg0) {}
}
