
import java.awt.Image;
import java.awt.Rectangle;
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
public class Objective {
    private String obj="coin.png";
    private String nObjectsLevel;
    private int value;
    private ArrayList<Tile> tiles;
    private int x;
    private int y;
    private int width;
    private int height;
    private Image image;

    public Objective(int x, int y, int width, int height) {
        ImageIcon image_icon = new ImageIcon(this.getClass().getResource(obj));
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
    
    
    
    
    
}
