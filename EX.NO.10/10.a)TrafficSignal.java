
package OOPS;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
class App extends JFrame implements ItemListener{
	JFrame actualWindow;
	JPanel messagebox, lightsbox;
	JLabel message;
	ButtonGroup btn_group;
	JRadioButton red,yellow,green;
	
	App() {
		
		actualWindow = new JFrame("Traffic Lights");
		messagebox = new JPanel();
		lightsbox= new JPanel();
		message = new JLabel("Select Light");
		btn_group = new ButtonGroup();
		red = new JRadioButton("Red");
		yellow = new JRadioButton("Yellow");
		green = new JRadioButton("Green");
		
		actualWindow.setLayout(new GridLayout(2, 1));
		
		
		red.setForeground(Color.RED);
		yellow.setForeground(Color.YELLOW);
		green.setForeground(Color.GREEN);
		
		btn_group.add(red);
		btn_group.add(yellow);
		btn_group.add(green);
		
		red.addItemListener(this);
		yellow.addItemListener(this);
		green.addItemListener(this);
		
		messagebox.add(message);
		lightsbox.add(red);
		lightsbox.add(yellow);
		lightsbox.add(green);
		
		actualWindow.add(messagebox);
		actualWindow.add(lightsbox);
				
		actualWindow.setSize(300, 200);
		actualWindow.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		JRadioButton selected = (JRadioButton) ie.getSource();
		String textOnButton = selected.getText();
		if(textOnButton.equals("Red")) {
			message.setForeground(Color.RED);
			message.setText("STOP");
		} else if(textOnButton.equals("Yellow")) {
			message.setForeground(Color.YELLOW);
			message.setText("READY");
		} else {
			message.setForeground(Color.GREEN);
			message.setText("GO");
		}
	}
}
public class TrafficSignal
{

	public static void main(String[] args) {
		new App();
	}

}
    

