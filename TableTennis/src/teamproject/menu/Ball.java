package teamproject.menu;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

 
public class Ball extends Rectangle {
        private static final int DIAMETER = 30;
        int x = 700;
        int y =100;
        int xa = -3;
        int ya = 1;
        Image image = Toolkit.getDefaultToolkit().createImage("/home/melloboy89/Game/TableTennis/lastgifs/mini-angry-bird.gif");

    	public Ball(){
    		setBounds(980,375,image.getWidth(null),image.getHeight(null));
    	}
        

		void tick() {
             	
				
                if (x + xa < 0)
                    xa = 3;
                if (x + xa > GamePanel.WIDTH - image.getWidth(null))
                    xa = -3;
                if (y + ya < 0)
                    ya = 1;
                if (y + ya > GamePanel.WIDTH  - image.getHeight(null))
                    ya = -1;
                if (collision()){
                	xa = -xa;
                	if(xa<11)
                		xa++;
                    x = 20;
                    
                }
//                if (collision2()) {
//                	xa = -xa;
//                	if(xa>-11)
//                		xa--;
//					x = 980 - image.getWidth(null);
//					
//				}
                
                x = x + xa;
                y = y + ya;
                
               
        }
 
        private boolean collision() {
        	
        	return SinglePlayerState.racquet.getBounds().intersects(getBounds());        }
        
//        private boolean collision2(){
//        	return Level1State.racquet2.getBounds().intersects(getBounds());
//        }
        public void paint(Graphics2D g) {
                g.drawImage(image,x, y, null);
        }
       
        public Rectangle getBounds() {
                return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
        }
}