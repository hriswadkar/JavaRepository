/**
 * @(#)ButtonActionApplet.java
 *
 * ButtonActionApplet Applet application
 *
 * @author 
 * @version 1.00 2018/10/21
 */
 
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ButtonActionApplet extends Applet {
	
	public void init() {
		this.setLayout(new FlowLayout());
		Button btn = new Button("Click Me");
		btn.addActionListener(new ButtonClickListener());
		add(btn);
	}

	public void paint(Graphics g) {
		
		g.drawString("Welcome to Java!!", 50, 60 );
		
	}
}

class ButtonClickListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
	}
}