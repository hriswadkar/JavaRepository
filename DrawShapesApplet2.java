/**
 * @(#)DrawShapesApplet2.java
 *
 *
 * @author 
 * @version 1.00 2018/10/27
 */

import java.awt.*;

public class DrawShapesApplet2 extends java.applet.Applet {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        setSize(400, 400);
    }

    public void paint(Graphics g) {
		g.setColor(Color.red);
		
		//g.drawOval(100, 100, 150, 100);
		g.drawArc(10, 25, 300, 400, 20, 40);
		
		g.draw3DRect(25, 75, 45, 55, true);
		
		g.setColor(Color.cyan);
		g.fillOval(30, 45, 100, 100);
		
		g.setColor(Color.darkGray);
		g.fillRoundRect(150, 170, 145, 165, 5, 5);
    }
}
// <applet code="DrawShapesApplet2.class" width	= "400" height	= "400"></applet>