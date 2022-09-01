//Step 2 - Implementing the Falling part

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class BlockFalling extends Applet implements Runnable {
   Thread t = null;
   
   private int xVal = 0;
   private int yVal = 0;
   
   private int r = (int) (Math.random() * 256);
   private int gr = (int) (Math.random() * 256);
   private int b = (int) (Math.random() * 256);
   
   private Block blo = new Block(xVal, yVal, r, gr, b, 20);
   private Block[][] array = new Block[20][20];
   
   public void start() {
       t = new Thread(this);
       t.start();
   }
   
   public void init() {
       setBackground(Color.black);
   }
   
   public void run() {
       while (true) {
           repaint();
                      
           try {
                t.sleep(100);
            } catch (Exception e) {}
            
           blo.incY();
       }
       
   }
   
   
   public void paint(Graphics g) {
       blo.draw(g);
       
       for (Block[] arr: array) {
           for (Block temp: arr) {
              if (temp != null) temp.draw(g);
           }
       }
       
       check(g); //paint method is solely for graphics
       //thus, we will do further calculations in a separate method
   }
   
   
   public void check(Graphics g) {
       int r1 = (blo.getX()) / 20; //index for Block array
       int r2 = (blo.getY()) / 20; //index for array inside Block array
       
       //if block reaches bottom, or if another block is underneath:
       if (r2 == 19 || array[r1][r2+1] != null) {
           array[r1][r2] = blo;
           
           r = (int) (Math.random() * 256);
           gr = (int) (Math.random() * 256);
           b = (int) (Math.random() * 256);
           
           int temp = (int) (Math.random() * 20);
           xVal = 20 * temp;
           yVal = 0;
           
           blo = new Block(xVal, yVal, r, gr, b, 20);
       }
   }
       
   
}
