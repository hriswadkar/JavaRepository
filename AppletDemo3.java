import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletDemo3 extends Applet {
	public void init() {
		setLayout(new FlowLayout());
		Button btn = new Button();
		btn.addActionListener(new ButtonClickListener());
		add(btn);
	}
}

class ButtonClickListener implements ActionListener {
	//@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
	}
	
}

/* <APPLET CODE="AppletDemo3.class" WIDTH="300" HEIGHT="300>
 * </APPLET>
 **/