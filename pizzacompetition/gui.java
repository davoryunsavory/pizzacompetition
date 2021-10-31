import javax.swing.*;
import java.awt.*; 

public class gui extends Canvas{

    public void paint(Graphics g) {
        //Grid
        g.drawLine(500,0,500,700);
        g.drawLine(0, 175, 500, 175);
        g.drawLine(0, 350, 500, 350);
        g.drawLine(0, 525, 500, 525);
        //Pizza
        g.drawOval(110, 70, 50, 50);
        g.drawOval(220, 60, 75, 75);
        g.drawOval(350, 50, 100, 100);
        //Sauce
        
        g.drawRect(110, 250, 75, 75);
    }

    public void drawtriangle(int point1x, int point1y, int point2x, int point2y, int point3x, int point3y, Graphics g) {

        g.drawLine(point1x, point1y, point2x, point2y);
        g.drawLine(point2x, point2y, point3x, point3y);
        g.drawLine(point3x, point3y, point1x, point1y);

    }
    
    public static void main(String[] args) {
        gui m = new gui();  
        JFrame f = new JFrame();// creating instance of JFrame
        JLabel l1;
        l1 = new JLabel("Pizza Order");
        l1.setBounds(220,10,100,30);

        JLabel pizzacrust;
        pizzacrust = new JLabel("Crust");
        pizzacrust.setBounds(20, 80, 50, 30);

        JLabel sauce;
        sauce = new JLabel("Sauce");
        sauce.setBounds(20, 250, 50, 30);
        
        f.add(sauce);
        f.add(pizzacrust);
        f.add(l1);
        f.add(m);
        

        f.setSize(700, 700);// 500 width and 500 height
        //f.setLayout(null);// using no layout managers
        f.setVisible(true);// making the frame visible
    }
}