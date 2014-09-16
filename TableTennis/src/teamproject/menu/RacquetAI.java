package teamproject.menu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class RacquetAI extends Rectangle {

	
	private int x = 980;
	private int y = 275;
	
     
	
	public RacquetAI(int width,int height){
		setBounds(0,375,width,height);
	}
	public void tick(){
		
		if (SinglePlayerState.ball.y<y&& y>=0) { //ballY<aiY
			y-=1;
		}
		if (SinglePlayerState.ball.y>y && y  < GamePanel.HEIGHT - height) { //ballY < aiY
			y+=1;
			
		
		
	}
	}
	
	public void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(x,y,width,height);
	}
	public void keyPressed(int k){

	}
	public void keyReleased(int k){

	}
	public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
	}
}
