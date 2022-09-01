//Step 1 - Implementing MouseListeners

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class CircleClick extends Applet implements MouseListener {
    private int x = 0;
    private int y = 0;
    
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
        
        int r = (int) (Math.random() * 256);
        int gr = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        
        Color c = new Color(r, gr, b);
        g.setColor(c);
        
        
        int size = (int) (Math.random() * 100) + 1;
        int radius = size / 2;
        
        
        g.fillOval(x - radius, y - radius, size, size);
    }
    
}
