import java.awt.Graphics;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.applet.Applet;
import java.applet.AppletContext;

public class MovingCircle extends Applet {
	Button btn;
	
	public void init() {
		btn = new Button("Submit");
		
		this.setLayout(new FlowLayout());
		add(btn);
		
		
		
	}
	
	public void paint(Graphics g) {
		g.fillOval(30, 30, 40, 40);
	}
}

// <APPLET CODE="MovingCircle.class" WIDTH="400" HEIGHT="400"></APPLET>