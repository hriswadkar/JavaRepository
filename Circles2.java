import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circles2 extends Applet implements Runnable {

    int x = 0, y = 0;

    public void start() {
        setSize(500, 500);
        setBackground(Color.BLACK);
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            try {
                update();
                Thread.sleep(50);

            } catch (InterruptedException ex) {

            }
        }
    }

    public void update() {
    	if (x <=495) {
    		x += 5;	
    	} else {
    		x -= 5;		
    	}
        
        if(y <=495) {
        	y += 6;	
        } else {
        	y -= 6;	
        }
        
        repaint();
    }

    public void paint(Graphics e) {
        super.paint(e);
        Graphics2D g = (Graphics2D) e;
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 20, 20);

    }
}

// <APPLET CODE="Circles2.class" WIDTH="500" HEIGHT="500"></APPLET>