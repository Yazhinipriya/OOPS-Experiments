package oops1;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;    
import java.awt.event.*;    
public class shapes extends JFrame implements ActionListener{    
JRadioButton rb1,rb2,rb3;    
JButton b;    
shapes(){      
rb1=new JRadioButton("SQUARE");    
rb1.setBounds(100,50,100,30);      
rb2=new JRadioButton("RECTANGLE");    
rb2.setBounds(100,100,100,30);   
rb3=new JRadioButton("CIRCLE");    
rb3.setBounds(100,150,100,30); 
ButtonGroup bg=new ButtonGroup();    
bg.add(rb1);bg.add(rb2);bg.add(rb3);   
b=new JButton("click");    
b.setBounds(100,200,80,30);    
b.addActionListener(this);    
add(rb1);add(rb2);add(rb3);add(b);    
setSize(300,300);    
setLayout(null);    
setVisible(true);    
}    
public void actionPerformed(ActionEvent e){    
if(rb1.isSelected()){    
   
}    
if(rb2.isSelected()){    
    
JOptionPane.showMessageDialog(this,"You are Female.");    
}    
} 
public class Shapes extends Applet
{
public void paint(Graphics g)
    {
	if(rb1.isSelected()){
	g.setColor(Color.black);
	g.drawString("Square",75,200);
	int x[]={50,150,150,50};
	int y[]={50,50,150,150};
	g.drawPolygon(x,y,4);
	g.setColor(Color.yellow);
	g.fillPolygon(x,y,4);
        }
	
	if(rb2.isSelected()){    
    
	g.setColor(Color.black);
	g.drawString("Circle",400,200);
	g.drawOval(350,50,125,125);
	g.setColor(Color.yellow);
	g.fillOval(350,50,125,125);	
        }
        
        if(rb3.isSelected()){    
	g.setColor(Color.black);
	g.drawString("Rectangle",300,380);
	x=new int[]{250,450,450,250};
	y=new int[]{250,250,350,350};
	g.drawPolygon(x,y,4);
	g.setColor(Color.yellow);
	g.fillPolygon(x,y,4);
	
    }
        }
public static void main(String args[]){    
new shapes();    
}
}
}
