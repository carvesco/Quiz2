/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Estudiante
 */
public class World {
    private int number;
    private int width;
    private int height;
    private ArrayList<Enemy> enemies;
    private int nEnemies;
    private ArrayList<Objective> objects;
    private int nObjectives;
    private ArrayList<Obstacle> obstacles;
    private int nObstacles;

    public World(int nObjetivos,int nObstac,int nEnemy) {
        this.objects = new ArrayList<Objective>(nObjetivos);
        this.nObjectives = nObjetivos;
        this.enemies = new ArrayList<Enemy>(nEnemy);
        this.nEnemies = nEnemy;
        this.obstacles = new ArrayList<Obstacle>(nObstac);
        this.nObstacles = nObstac;
    }
    //objetivos
    //
    //
    //
    //
    public void addObjectives(){
        int count = 0;
        while (count<this.nObjectives){
            Objective t = new Objective(40, 10, 25, 25);
            this.objects.add(count, t);
            count+=1;
        }
    }
    public int getNObjects(){
        return this.objects.size(); 
    }
    public void addObjetivos(){
        int cont=1;
        int posX = (int)(Math.random()*500+1);
        int posY = (int) (Math.random()*500+1);
        while (cont<this.nObjectives){
            Objective a = new Objective(posX, posY, 25, 25);
            this.objects.add(cont, a);
            cont+=1;
        }
    }
    public Image getObjImage(){
        return this.objects.get(0).getImage();
    }
    public int getObjectiveX(int nPos){
        int x= this.objects.get(nPos).getX();
        return x;
    }
    public int getObjectiveY(int nPos){
        int y= this.objects.get(nPos).getY();
        return y;
    }
    public int getObjectiveWidth(int nPos){
        int width= this.objects.get(nPos).getWidth();
        return width;
    }
    public int getObjectiveHeight(int nPos){
        int height= this.objects.get(nPos).getHeight();
        return height;
    }
    public void setObjectiveX(int x,int nPos){
        this.objects.get(nPos).setX(x);
    }
    public void setObjectiveY(int y,int nPos){
        this.objects.get(nPos).setY(y);
    }
    public void setObjectiveWidth(int width,int nPos){
        this.objects.get(nPos).setWidth(width);
    }
    public void setObjectiveHeight(int height,int nPos){
        this.objects.get(nPos).setHeight(height);
    }
    public Rectangle getObjectiveBounds(int nPos){
        return new Rectangle (this.objects.get(nPos).getX(),this.objects.get(nPos).getY()
        ,this.objects.get(nPos).getWidth(),this.objects.get(nPos).getHeight());
    }
    //Obstaculos
    //
    //
    //
    public void addObstacles(){
        int count = 0;
        while (count<this.nObstacles){
            Obstacle t = new Obstacle(150, 100, 30, 30);
            this.obstacles.add(count, t);
            count+=1;
        }
    }
    public int getNObstacles(){
        return this.obstacles.size(); 
    }
    public void addObstaculo(){
        int cont=1;
        int posX = (int)(Math.random()*500+1);
        int posY = (int) (Math.random()*500+1);
        while (cont<this.nObstacles){
            Obstacle a = new Obstacle(posX, posY, 25, 25);
            this.obstacles.add(cont, a);
            cont+=1;
        }
    }
    public Image getObsImage(){
        return this.obstacles.get(0).getImage();
    }    
    public int getObstacleX(int nPos){
        int x= this.obstacles.get(nPos).getX();
        return x;
    }
    public int getObstacleY(int nPos){
        int y= this.obstacles.get(nPos).getY();
        return y;
    }
    public int getObstacleWidth(int nPos){
        int width= this.obstacles.get(nPos).getWidth();
        return width;
    }
    public int getObstacleHeight(int nPos){
        int height= this.obstacles.get(nPos).getHeight();
        return height;
    }
    public Rectangle getObstacleBounds(int nPos){
        return new Rectangle (this.obstacles.get(nPos).getX(),this.obstacles.get(nPos).getY()
        ,this.obstacles.get(nPos).getWidth(),this.obstacles.get(nPos).getHeight());
    }
    //enemigos
    //
    //
    //
    //
    public void addEnemy(){
        int count = 0;
        while (count<this.nEnemies){
            Enemy t = new Enemy(300, 300, 30, 30);
            this.enemies.add(count, t);
            count+=1;
        }
    }
    public int getNEnemies(){
        return this.enemies.size(); 
    }
    public void addEnemigo(){
        int cont=1;
        int posX = (int)(Math.random()*500+1);
        int posY = (int) (Math.random()*500+1);
        while (cont<this.nEnemies){
            Enemy a = new Enemy(posX, posY, 30, 30);
            this.enemies.add(cont, a);
            cont+=1;
        }
    }
    public void EnemyMove(){
        this.enemies.get(0).move1();
        
    }
    public Rectangle getEnemyBounds(int nPos){
        return new Rectangle (this.enemies.get(nPos).getX(),this.enemies.get(nPos).getY()
        ,this.enemies.get(nPos).getWidth(),this.enemies.get(nPos).getHeight());
    }
    public Image getEnemyImage(){
        return this.enemies.get(0).getImage();
    }
    public int getEnemyX(int nPos){
        int x= this.enemies.get(nPos).getX();
        return x;
    }
    public int getEnemY(int nPos){
        int y= this.enemies.get(nPos).getY();
        return y;
    }
    public int getEnemyWidth(int nPos){
        int width= this.enemies.get(nPos).getWidth();
        return width;
    }
    public int getEnemiHeight(int nPos){
        int height= this.enemies.get(nPos).getHeight();
        return height;
    }
    
    
    
    
    
    
    
}
