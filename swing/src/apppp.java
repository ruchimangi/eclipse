
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

	
	public class apppp extends JPanel {
		int x=0,y=0;
		int angleX=1, angleY=1;
		int speed=50;
		private void move() {
			if (x + angleX < 0) {
				angleX = speed;
			} else if (x + angleX > getWidth() - 50) {
				angleX = -speed;
			} else if (y + angleY < 0) {
				angleY = speed;
			} else if (y + angleY >getWidth() - 50) {
				angleY = -speed;
			}
			x = x + angleX;
			y = y + angleY;
			
		}
	  @ Override
	  public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 50, 50);
	}
	public static void main(String[]args)throws InterruptedException {
		JFrame frame=new JFrame("moving ball");
		apppp app=new apppp();
		frame.add(app);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while(true) {
			app.move();
		    app.repaint();
		    Thread.sleep(10);
			}
		}
	}
