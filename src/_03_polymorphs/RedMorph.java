package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph{
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
		RedMorph(int x, int y) {
			super(x, y);
		}
		public void update() {
			
		}
		@Override
		public void draw(Graphics g) {
			g.setColor(Color.red);
			g.fillRect(getX(), getY(), width, height);
		}
}
