/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author Estudiante
 */
public class Enemy {
    private String enemy="fire.png";
    private String nEnemiesLevel;
    private String nSpeed;
    private String animation;
    private ArrayList<Tile> tiles;
    private int width;
    private int height;
    private int x;
    private int y;
    private Image image;

    public Enemy(int x, int y,int width, int height) {
        ImageIcon image_icon = new ImageIcon(this.getClass().getResource(enemy));
        image = image_icon.getImage();
        this.height=height;
        this.width=width;
        this.x=x;
        this.y=y;
    }
    public Image getImage(){
        return image;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
    
    public void move(){
        if (x<0){
            x=500;
        }
        x-=1;
    }
    public void move1(){
        if (y<0){
            y=500;
        }
        y-=1;
    }
}
