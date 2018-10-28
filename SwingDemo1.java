import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo1 extends JFrame implements ActionListener {
	
	JButton btn1, btn2;
	JLabel lbl1, lbl2;
	JTextField txt1;
	JPasswordField txt2;
	
	public SwingDemo1() {
		JFrame frame = new JFrame("Login Form");
		frame.setLayout(new FlowLayout());
		
		lbl1 = new JLabel("User Name:");
		lbl2 = new JLabel("Password:");
		
		txt1 = new JTextField(20);
		txt2 = new JPasswordField(20);
		
		btn1 = new JButton("Submit");
		btn2 = new JButton("Cancel");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		frame.add(lbl1);
		frame.add(lbl2);
		frame.add(txt1);
		frame.add(txt2);
		frame.add(btn1);
		frame.add(btn2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e);
		if(e.getSource() == btn1) {
			JOptionPane.showMessageDialog(null, "alert", "Welcome " + txt1.getText(), JOptionPane.ERROR_MESSAGE);
		} else {
			txt1.setText("");
			txt2.setText("");
		}
	}
	
	public static void main(String[] args) {
		new SwingDemo1();
	}
}