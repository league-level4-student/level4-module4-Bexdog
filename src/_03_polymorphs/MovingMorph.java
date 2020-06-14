package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{
	private static int width = 0;
	private static int height = 0;
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
		MovingMorph(int x, int y) {
			super(x, y);
		}
		public void update() {
			this.setX(getX()-1);
			this.setY(getY()+1);
		}
		@Override
		public void draw(Graphics g) {
			g.setColor(Color.green);
			g.fillRect(getX(), getY(), width, height);
		}
}
