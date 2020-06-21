package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph{
	 public static BufferedImage img;
	
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
	protected ImagePolymorph(int x, int y) {
		 
		super(x, y);
		// TODO Auto-generated constructor stub
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("download.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update() {
		
	}
	@Override
	public void draw(Graphics g) {
		g.drawImage(img, getX(), getY(), width, height, null);
		
	}

}
