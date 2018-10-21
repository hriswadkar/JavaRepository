/**
 * @(#)AppletDemo2.java
 *
 * AppletDemo2 Applet application
 *
 * @author 
 * @version 1.00 2018/10/21
 */
 
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class AppletDemo2 extends Applet {
	
	Label lbl1;
	Button btn1;
	Label lbl2;
	Button btn2;
	
	CheckboxGroup c;
	Checkbox c1;
	Checkbox c2;
	
	Choice abc;
	
	public void init() {
		lbl1 = new Label("Button 1");
		btn1 = new Button("OK");
		btn1.addActionListener(new B1());
		lbl2 = new Label("Button 2");
		btn2 = new Button("Cancel");
		btn2.addActionListener(new B2());
		
		c = new CheckboxGroup();
		c1 = new Checkbox("Colour and White", c, true);
		c2 = new Checkbox("Colour", c, false);
		c1.addMouseListener(new Check1());
		c2.addMouseListener(new Check2());
		
		abc = new Choice();
		abc.add("Onida");
		abc.add("BPL");
		abc.add("Samsung");
		abc.add("Philips");
		abc.add("Videocon");
		abc.addItemListener(new Ch());
		
		setLayout(new FlowLayout());
		add(lbl1);
		add(btn1);
		add(lbl2);
		add(btn2);
		
		add(c1);
		add(c2);
		
		add(abc);
	}

	public void paint(Graphics g) {
		
		g.drawString("Welcome to Java!!", 50, 60 );
		
	}
	
	class B1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getAppletContext().showStatus(e.getSource() + " was clicked");
		}
	}
	
	class B2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getAppletContext().showStatus(e.getSource() + " was clicked");
		}
	}
	
	class Check1 extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			showStatus("You have selected Black and White TV");
		}
	}
	
	class Check2 extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			showStatus("You have selected Colour TV");
		}
	}
	
	class Ch implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			String s = (String)e.getItem();
			showStatus("You have selected " + s + " brand");
		}
	}	
}

