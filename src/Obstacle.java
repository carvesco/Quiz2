
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Obstacle {
    private String obstacle="blok.png";
    private String nObstacleLevel;
    private Tile tiles;
    private int x;
    private int y;
    private int width;
    private int height;
    private Image image;

    public Obstacle(int x, int y, int width, int height) {
        ImageIcon image_icon = new ImageIcon(this.getClass().getResource(obstacle));
        image = image_icon.getImage();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public Image getImage(){
        return image;
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
    
    
}
