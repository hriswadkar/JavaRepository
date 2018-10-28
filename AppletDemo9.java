import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.applet.Applet;

public class AppletDemo9 extends Applet {
	public void init() {
		
	}
	
	public void paint(Graphics g) {
		
		Font f = new Font("Roboto Mono", 2|3, 22);
		g.setFont(f);
		g.drawString("Hello World Applet!", 50, 50);
		
		g.setColor(Color.green);
		g.fillRect(50, 70, 60, 60);
		
		g.setColor(Color.magenta);
		g.fillOval(130, 70, 60, 60);
		
		g.setColor(Color.red);
		g.fillArc(180, 70, 80, 80, 50, 50);
		
		g.setColor(Color.orange);
		//int[] xPoints = {100, 120, 130};
		//int[] yPoints = {140, 150, 160};
		//g.fillPolygon(xPoints, yPoints, 5);
		
		g.fillRoundRect(50, 150, 60, 60, 25, 25);
		
		g.drawLine(150, 380, 350, 380);
		g.drawLine(150, 380, 270, 230);
		g.drawLine(350, 380, 270, 230);
		
		g.fillArc(280, 170, 80, 80, 10, 180);
		g.setColor(Color.cyan);
		g.fillArc(280, 170, 80, 80, 180, 180);
	}
}

// <APPLET CODE="AppletDemo9" WIDTH="400" HEIGHT="400"></APPLET>