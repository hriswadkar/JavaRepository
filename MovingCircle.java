import java.awt.Graphics;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.applet.Applet;
import java.applet.AppletContext;

public class MovingCircle extends Applet {
	Button btn;
	boolean btnClicked = false;
	public void init() {
		btn = new Button("Submit");
		
		this.setLayout(new FlowLayout());
		add(btn);
		btn.addActionListener(new btnClick());
		
		
	}
	
	public void paint(Graphics g) {
		
		if(btnClicked) {
			g.fillOval(90, 90, 40, 40);
		} else {
			g.fillOval(30, 30, 40, 40);
		}
	}
	
	class btnClick implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn) {
				btnClicked = true;
				repaint();
			}
		}
	}
}

// <APPLET CODE="MovingCircle.class" WIDTH="400" HEIGHT="400"></APPLET>