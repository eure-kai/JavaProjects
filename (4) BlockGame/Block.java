import java.awt.*;
import java.applet.*;


public class Block {
    private int xC;
    private int yC;
    
    private int size;
    private Color c;
    
    public Block(int x, int y, int r, int gr, int b, int s) {
        xC = x;
        yC = y;
        c = new Color(r, gr, b);
        size = s;
    }
    
    public void incX() {
        if (xC < 380) xC += 20;
        else xC = 380;
    }
    
    public void decX() {
        if (xC > 0) xC -= 20;
        else xC = 0;
    }
    
    public void incY() {
        yC += 20;
    }
    
    public int getX() {
        return xC;
    }
    
    public int getY() {
        return yC;
    }
    
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillRect(xC, yC, size, size);
    }

}

