package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MousePolymorph extends Polymorph{
	int newX = 50;
	int newY = 50;
	private static int width = 50;
	private static int height = 50;
	int getWidth() {
		return width;
	}
	void setWidth(int i) {
		width = i;
	}
	int getHeight() {
		return height;
	}
	void setHeight(int i) {
		height = i;
	}
	protected MousePolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public void update() {
	
	}
	public void update2(int i, int j) {
		setX(i);
		setY(j-30);
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(getX(), getY(), width, height);
	}
	
	
	

}
