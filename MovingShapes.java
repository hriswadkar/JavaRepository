import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MovingShapes extends Applet implements Runnable {
	int xRect = 200;
	int yRect = 200;
	
	Button btn = new Button("Click Me");
	Thread t;
	
	public void init() {
		setSize(800, 400);
		setBackground(new Color(123, 47, 223));
		setLayout(new FlowLayout());
		add(btn);
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
		
		while(xRect <=380 && yRect <= 380) {
			xRect++;
			yRect++;
			repaint();
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
			}
		}
	}
}

//<APPLET CODE="MovingShapes.class" WIDTH="800" HEIGHT="400"></APPLET>