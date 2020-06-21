package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    int newX = 0;
    int newY = 0;
    int x = 0;
    int y = 0;
    private JFrame window;
    private Timer timer;
    ArrayList <Polymorph> morphs;
    Polymorph circleMorph;
//    Polymorph bluePoly;
//    Polymorph redPoly;
//   Polymorph movePoly;
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseMotionListener(this);
   	 window.addMouseListener(this);
   	 morphs = new ArrayList <Polymorph>();
   	 morphs.add(new CirclePolymorph(100,100));
   	morphs.add(new MousePolymorph(150,200));
   	morphs.add(new ImagePolymorph(50,300));
   	morphs.add(new ClickPolymorph(300,300));
//   	 bluePoly = new BluePolymorph(50, 50);
//   	 redPoly = new RedMorph(200,50);
//   	 movePoly = new MovingMorph(80,50);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	for(Polymorph pm : morphs) {
   		pm.draw(g);
   	}
   	 //draw polymorph
//  	 bluePoly.draw(g);
//   	 redPoly.draw(g);
//   	 movePoly.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for(Polymorph pm : morphs) {
   		pm.update();
   	}
   ((MousePolymorph)	morphs.get(1)).update2(newX, newY);;
//   	 bluePoly.update();
//   	 redPoly.update();
//   	 movePoly.update();
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		newX =	e.getX();
		newY =	e.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX()+", "+e.getY());
		x =	e.getX();
		y =	e.getY();
	if(x < 360 &&x>310&&y<390&&y>340){
		JOptionPane.showMessageDialog(null, "Hello, You clicked?");
	}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
}
