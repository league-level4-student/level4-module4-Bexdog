package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{
	private double counter = 0;
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
	protected CirclePolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
public void update(){
	setX((int) (250*Math.cos(counter/4)+225));
	setY((int) (250*Math.sin(counter/4)+225));
counter+=0.25;
}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(getX(), getY(), width, height);
	}

}
