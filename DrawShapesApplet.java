import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;

public class DrawShapesApplet extends Applet {
	public void init() {
		setSize(400, 400);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		
		g.drawOval(100, 100, 150, 100);
	}
}