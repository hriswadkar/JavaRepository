/*
 * This java code demonstrates a moving circle
 * Applet, when loaded shows a circle and a button
 * When clicked button, the circle starts moving
 * and stops after certain condition is met.
 **/
import java.awt.Graphics;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.Applet;

public class MovingShape extends Applet implements Runnable {
	
	int xRect = 200;
	int yRect = 200;
	Button btn = new Button("Click Me");
	Button btnStop = new Button("Stop");
	Thread t;
	
	public void init() {
		setSize(800, 400);
		setBackground(new Color(123, 47, 223));
		setLayout(new FlowLayout());
		add(btn);
		add(btnStop);
		btn.addActionListener(new btnClick());
	}
	
	public void start() {
		t = new Thread(this);
	}
	
	public void paint(Graphics g) {
		g.setColor(new Color(244, 231, 2));
		g.fillOval(xRect, yRect, 80, 80);
	}
	
	public void run() {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		while(xRect <= 380 && yRect <= 380) {
			xRect++;
			yRect++;
			repaint();
			showStatus("xRect: " + xRect + ", yRect: " + yRect);
			try {
				Thread.sleep(20);
			} catch(InterruptedException ex) {
				
			}
		}
	}
	
	class btnClick implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn) {
				t.start();
			} else if(e.getSource() == btnStop) {
				t.suspend();
			}
		}
	}
}

// <APPLET CODE="MovingShape.class" WIDTH="800" HEIGHT="400"></APPLET>