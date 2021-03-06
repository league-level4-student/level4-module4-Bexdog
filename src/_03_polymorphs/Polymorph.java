package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph{
   private int x;
   private int y;
    int getX() {
    	return x;
    }
    void setX(int i) {
    	x = i;
    }
    int getY() {
    	return y;
    }
    void setY(int i) {
    	y = i;
    }
    protected Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update() {
    	
    }
   	
    public abstract void draw(Graphics g);
}
