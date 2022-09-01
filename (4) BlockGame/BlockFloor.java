//Step 1 - Creating a collection of blocks (Block Floor)

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class BlockFloor extends Applet implements Runnable {
   Thread t = null;
   
   private int xVal = 0;
   private int yVal = 0;
   
   private int r1 = 0;
   private int r2 = 0;
   
   private int r = 0;
   private int gr = 0;
   private int b = 0;
   
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
                Thread.sleep(100);
            } catch (Exception e) {}
       }
       
   }
   
   public void paint(Graphics g) {
       while (true) {
           r1 = (int) (Math.random() * 21);
           r2 = (int) (Math.random() * 21);
           
           if (array[r1][r2] == null) {
               xVal = 20 * r1;
               yVal = 20 * r2;
               
               r = (int) (Math.random() * 256);
               gr = (int) (Math.random() * 256);
               b = (int) (Math.random() * 256);
               
               array[r1][r2] = new Block(xVal, yVal, r, gr, b, 20);
               
               for (Block[] arr: array) {
                   for (Block temp: arr) {
                       if (temp != null) temp.draw(g);
                   }
               }
               
               break;
           }
       }
       
   }
       
   
}
