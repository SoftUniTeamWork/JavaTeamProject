package teamproject.menu;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

public class MultiPlayerState extends GameState {
	public static Racquet racquet;
	public static Racquet2 racquet2;
	public static BallM ball;
	Image background = Toolkit.getDefaultToolkit().createImage("lastgifs/background.png");
	public MultiPlayerState(GameStateManager gsm){
		super(gsm);
	}

	
	public void init() {
		racquet = new Racquet(20,150);
		racquet2 = new Racquet2(20,150);
		ball = new BallM();
		
	}

	
	public void tick() {
		racquet.tick();
		racquet2.tick();
		ball.tick();
		
	}

	
	public void draw(Graphics g) {
		g.drawImage(background,0, 0, null);
		ball.draw(g);
		racquet.draw(g);
		racquet2.draw(g);
		
	}
	


	public void keyPressed(int k) {
		racquet.keyPressed(k);
		racquet2.keyPressed(k);
	}


	public void keyReleased(int k) {
		racquet.keyReleased(k);
		racquet2.keyReleased(k);
		
	}
}
