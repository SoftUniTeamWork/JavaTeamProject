package teamproject.menu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Racquet extends Rectangle {
	private int ya=5;
	private int x,y;
	
     
	
	public Racquet(int width,int height){
		setBounds(0,375,width,height);
	}
	public void tick(){
		if (y + ya>0 && y + ya <GamePanel.HEIGHT - height) {
				y = y + ya;	
		}
	}
	
	public void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(x,y,width,height);
	}
	public void keyPressed(int k){
		if (k == KeyEvent.VK_W)
            ya = -7;
		if (k == KeyEvent.VK_S)
            ya = 7;
	}
	public void keyReleased(int k){
		ya = 0;
	}
}