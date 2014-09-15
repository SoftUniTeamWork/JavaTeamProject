import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
 
public class Ball {
        private static final int DIAMETER = 30;
        int x = 700;
        int y =100;
        int xa = -2;
        int ya = 2;
        int count = 0;
        private Game game;
        Image image = Toolkit.getDefaultToolkit().createImage("/home/melloboy89/Game/TableTennis/lastgifs/mini-angry-bird.gif");
        int speed = 3;
        public Ball(Game game) {
                this.game= game;
        }
 
        void move() {
                if (x + xa < 0)
                        game.gameOver();
                if (x + xa > game.getWidth() - image.getWidth(null))
                        game.gameOver();
                if (y + ya < 0)
                        ya = speed;
                if (y + ya > game.getHeight() - image.getWidth(null))
                        ya = speed * (-1);
                if (collision()){
                        xa = 1;
                        x = 20;
                        count ++;
                        
                }
                if (collision2()) {
					xa = -1;
					x = 780 - image.getWidth(null);
					count++;
				}
                x = x + xa;
                y = y + ya;
        }
 
        private boolean collision() {
        	
        	return game.racquet.getBounds().intersects(getBounds());        }
        
        private boolean collision2(){
        	return game.racquet2.getBounds().intersects(getBounds());
        }
        public void paint(Graphics2D g) {
                g.drawImage(image,x, y, null);
        }
       
        public Rectangle getBounds() {
                return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
        }
}