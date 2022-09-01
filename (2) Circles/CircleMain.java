//Step 2 - Displaying previous 10 circles at once

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

import java.util.ArrayList;

public class CircleMain extends Applet implements MouseListener {
    int x = 0;
    int y = 0;
    
    ArrayList<Integer[] > data = new ArrayList<>();
    
    
    public void init() {
        setBackground(Color.white);
        addMouseListener(this);
    }
    
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        
        repaint();
        
    }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    
    public void paint(Graphics g) {
        
        int size = (int) (Math.random() * 50) + 1;
        int radius = size / 2;
        int r = (int) (Math.random() * 256);
        int gr = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        
        int last = data.size() - 1;
        
        data.add(new Integer[7]);
        
        data.get(last)[0] = x - radius;
        data.get(last)[1] = y - radius;
        data.get(last)[2] = size;
        data.get(last)[3] = size;
        data.get(last)[4] = r;
        data.get(last)[5] = gr;
        data.get(last)[6] = b;
        
        
        for (int i = last; i > last - 10; i--) {
            if (i < 0) break;
            
            else {
                Color c = new Color(data.get(i)[4], data.get(i)[5], data.get(i)[6]);
                g.setColor(c);
                g.fillOval(data.get(i)[0], data.get(i)[1], data.get(i)[2], data.get(i)[3]);
            }
        }
            
            
    }
       
        
    
}
