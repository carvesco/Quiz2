/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class Maze extends  JPanel implements ActionListener{
    private Timer time;
    private Screen configScreen;
    private World worlds;
    private Hero heroes;
    private final int DELAY =10;
    private String fondo="fondo.png";
    ImageIcon image_icon;
    
    

    public Maze() throws Exception{
       
       /*Scanner leer = new Scanner(System.in);
       System.out.println("ancho");
       int ancho = leer.nextInt();
       System.out.println("alto");
       int alto = leer.nextInt();
       */
       initScreen(540,540);
        
        
        
    }
    public void initScreen(int ancho,int alto){
        Screen medidas = new Screen(ancho, alto);
        addKeyListener(new TAdapter());
        setFocusable(true);
        
        setBackground(Color.WHITE);
        setDoubleBuffered(true);
        setPreferredSize(new Dimension(medidas.getWidth(),medidas.getHeight()));
        
        image_icon=new ImageIcon(this.getClass().getResource(fondo));
        
        heroes = new Hero(10, 10, 30, 30);
        worlds = new World(2,2,2 );
        //operaciones objetivos
        worlds.addObjectives();
        int nObject = worlds.getNObjects();
        int countObject =0;
        System.out.println(nObject);
        worlds.addObjetivos();
        //opetaciones obstaculos
        worlds.addObstacles();
        int nObstacle = worlds.getNObstacles();
        int countObstacle =0;
        System.out.println(nObstacle);
        worlds.addObstaculo();
        //operaciones enemigos
        worlds.addEnemy();
        int nEnemies = worlds.getNEnemies();
        int countEnemies =0;
        System.out.println(nEnemies);
        worlds.addEnemigo();
        
        
        
        time = new Timer(DELAY, this);
        time.start();
        
        
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
       super.paintComponent(g);
        
       Graphics2D g2d = (Graphics2D) g;
       g2d.drawImage(image_icon.getImage(), 0, 0, 540, 540, this);
       g2d.drawImage(heroes.getImage(), heroes.getX(), heroes.getY(), heroes.getWidth(), heroes.getHeight(), this);
       int nObstacle =worlds.getNObstacles();
       int countObstacle = 0;
       while (countObstacle<nObstacle){
           g2d.drawImage(worlds.getObsImage(),worlds.getObstacleX(countObstacle), worlds.getObstacleY(countObstacle),
               worlds.getObstacleWidth(countObstacle),worlds.getObstacleHeight(countObstacle), this);
           countObstacle=countObstacle+1;
       }
       int nObject =worlds.getNObjects();
       int countObject = 0;
       while (countObject<nObject){
           g2d.drawImage(worlds.getObjImage(),worlds.getObjectiveX(countObject), worlds.getObjectiveY(countObject),
               worlds.getObjectiveWidth(countObject),worlds.getObjectiveHeight(countObject), this);
           countObject=countObject+1;
       }
       int nOenemy =worlds.getNEnemies();
       int countEnemy = 0;
       while (countEnemy<nOenemy){
           g2d.drawImage(worlds.getEnemyImage(),worlds.getEnemyX(countEnemy), worlds.getEnemY(countEnemy),
               worlds.getEnemyWidth(countEnemy),worlds.getEnemiHeight(countEnemy), this);
           countEnemy=countEnemy+1;
       }
       
       
    }   
    @Override
    public void actionPerformed(ActionEvent e) {
        heroes.move();
        worlds.EnemyMove();
        
           
        checkCollisions();
        repaint();  
    }
    
    public void checkCollisions() {
        
      Rectangle rHero = heroes.getBounds();
      Rectangle rEnemy = worlds.getEnemyBounds(0);
      Rectangle rObejct = worlds.getObjectiveBounds(1);
      Rectangle rObstacle = worlds.getObstacleBounds(0);
      if ((rHero.intersects(rEnemy))&&(heroes.getLives()>1)) {
          JFrame vidas = new JFrame("Vidas");
        vidas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vidas.setSize(200, 70);
        JPanel vids = new JPanel(new FlowLayout());
        JLabel vid= new JLabel("vidas: ");
        JLabel nVid = new JLabel( Integer.toString(heroes.getLives()) );
        vids.add(vid);
        vids.add(nVid);
        vidas.add(vids);
        vidas.setLocation(205,70);
        vidas.setVisible(true);
            System.out.println("Colision");
            heroes.setX(10);
            heroes.setY(10);
            int vidas1 = heroes.getLives();
            heroes.setLives(vidas1-1); 
      }else if((rHero.intersects(rEnemy))&&(heroes.getLives()==1)){
            int vidas=0;
            heroes.setLives(vidas);
            JOptionPane.showMessageDialog(null, "perdiste¡¡¡¡¡¡¡¡¡");
            
      }
      if (rHero.intersects(rObejct)){
          System.out.println("colision");
          worlds.setObjectiveWidth(0,1);
          worlds.setObjectiveHeight(0,1);
          JOptionPane.showMessageDialog(null, "Ganaste¡¡¡¡¡¡¡¡¡");
      }
      if (rHero.intersects(rObstacle)){
          System.out.println("colision");
          heroes.setX(worlds.getObstacleX(0)-30);
          heroes.setY(worlds.getObstacleY(0)-30);
      }
      
      
      
    }
    
    
        
    private class TAdapter extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
            heroes.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            heroes.keyPressed(e);
        }
    } 
    
}
