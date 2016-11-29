
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Hero{
    
    private int lives=3;
    private int score;
    private String hero="heroo.png";
    private int dx;
    private int dy;
    private int x;
    private int y;
    private int width;
    private int height;
    private Image image;

    public Hero( int x, int y,int width,int height) {
        ImageIcon image_icon = new ImageIcon(this.getClass().getResource(hero));
        image = image_icon.getImage();
        this.dx = dx;
        this.dy = dy;
        this.x = x;
        this.y = y;
        this.height=height;
        this.width=width;
    }
    public Image getImage(){
        return image;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
   
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public void removeLife(){
        lives=lives-1;
    }
    public int getLives(){
        return lives;
    }
    public void setLives(int lives){
        this.lives=lives;
    }
    
    public void move(){
        if((x<0)||(x>500)){
            if (x<0){x+=1;}
            if (x>500){x-=1;}
        }else{x+= dx;}
        if((y<0)||(y>500)){
            if (y<0){y+=1;}
            if (y>500){y-=1;}
        }else{y+= dy;}
        
    }
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
            System.out.println("VK_SPACE"); //Se  va usar posteriormente 
        }
        
        if (key == KeyEvent.VK_LEFT) {
            dx = -5;
        }

        if (key == KeyEvent.VK_RIGHT) {
           dx = 5;
          
        }

        if (key == KeyEvent.VK_UP) {
            dy = -5;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 5;
        }
    }

    public void keyReleased(KeyEvent e) {
    
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }    
    
    
    
    
    
}