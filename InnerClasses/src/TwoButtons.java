import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author danni
 * Date: October 2020
 */

public class TwoButtons{
	
	
	/**
	 * use a frame
	 */
	JFrame frame;
	/**
	 * use a label
	 */
	JLabel label; 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoButtons gui = new TwoButtons ();
		//gui.go();
		int summe = gui.sum(1,2);
		System.out.println(summe);
		System.out.println("Whooo, it pushd!");
	}
	
	/**
	 * @param x fist input value
	 * @param y second input value
	 * @return addition of the input values
	 */
	public int sum(int x, int y) {
		return x+y;
	}
	/**
	 * this is my method
	 */
	public void go() {
	       frame = new JFrame();
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	       JButton labelButton = new JButton("Change Label");
	       labelButton.addActionListener(new LabelButtonListener());

	       JButton colorButton = new JButton("Change Circle");
	       colorButton.addActionListener(new ColorButtonListener());

	       label = new JLabel("I'm a label");       
	       MyDrawPanel drawPanel = new MyDrawPanel();
	       
	       frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
	       frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
	       frame.getContentPane().add(BorderLayout.EAST, labelButton);
	       frame.getContentPane().add(BorderLayout.WEST, label);

	       frame.setSize(420,300);
	       frame.setVisible(true);
	    }
	    
	     class LabelButtonListener implements ActionListener {
	        public void actionPerformed(ActionEvent event) {
	            if (label.getText() == "Ouch!") {
	            	label.setText("Hit me!");
	            }
	            else {
	            	label.setText("Ouch!");
	            }
	        }
	     } // close inner class

	     class ColorButtonListener implements ActionListener {
	        public void actionPerformed(ActionEvent event) {
	            frame.repaint();
	        }
	     }  // close inner class
	   
}

class MyDrawPanel extends JPanel {
    
    public void paintComponent(Graphics g) {
       
       g.fillRect(0,0,this.getWidth(), this.getHeight());

       // make random colors to fill with
       int red = (int) (Math.random() * 255);
       int green = (int) (Math.random() * 255);
       int blue = (int) (Math.random() * 255);

       Color randomColor = new Color(red, green, blue);
       g.setColor(randomColor);
       g.fillOval(70,70,100,100);
    }

}
