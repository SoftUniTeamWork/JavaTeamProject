package TeamAuburn.GameProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class BlockModeState extends GameState {
	public static Racquet3 racquet3;
	public static BallB ball;
	public static int p1Score;
	
	Image background = Toolkit.getDefaultToolkit().createImage("lastgifs/background.png");
	public BlockModeState(GameStateManager gsm){
		super(gsm);
	}

	
	public void init() {
		racquet3 = new Racquet3(150,20);
		ball = new BallB();	
	}

	
	public void tick() {
		racquet3.tick();
		ball.tick();	
	}

	
	public void draw(Graphics g) {
		g.drawImage(background,0, 0, null);
		ball.draw(g);
		racquet3.draw(g);

		g.setColor(Color.BLUE); 
		g.setFont(new Font("Arial",Font.PLAIN, 24));
		g.drawString("Player Score: " + p1Score, 30, 650);
		
	}



	public void keyPressed(int k) {
		racquet3.keyPressed(k);		
	}


	public void keyReleased(int k) {
		racquet3.keyReleased(k);
	}
}