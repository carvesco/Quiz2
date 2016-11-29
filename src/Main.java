
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gfd
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        JFrame inicio = new JFrame();
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicio.setTitle("Inicio");
        inicio.setSize(500, 170);
        inicio.setLayout(new BorderLayout());
        JPanel datosInicio = new JPanel(new GridLayout(3, 1));
        datosInicio.add(new JLabel("Titulo :"));
        datosInicio.add(new JLabel("Descripcion :"));
        datosInicio.add(new JLabel("Autor :"));
        JPanel dato = new JPanel(new GridLayout(3,1));
        JTextField fieldt = new JTextField();
        JTextField fieldd = new JTextField();
        JTextField fielda = new JTextField();
        dato.add(fieldt);
        dato.add(fieldd);
        dato.add(fielda);
        String titulo = fieldt.getText();
        String descripcion = fieldd.getText();
        String autor = fielda.getText();
        JPanel arriba = new JPanel(new BorderLayout());
        arriba.add(datosInicio, BorderLayout.WEST);
        arriba.add(dato, BorderLayout.CENTER);
        JPanel abajo = new JPanel(new FlowLayout());
        JButton botona = new JButton("Aceptar");
        botona.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                try{
                    JFrame ex = new Game(titulo, descripcion, autor);
                    ex.setVisible(true);
                }catch (Exception ex1){
                     ex1.printStackTrace();
                }
                inicio.dispose();
        
            }
        });
        abajo.add(botona);
        inicio.add(arriba,BorderLayout.NORTH);
        inicio.add(abajo,BorderLayout.SOUTH);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        inicio.setLocation(dim.width/2-inicio.getSize().width/2, 
                dim.height/2-inicio.getSize().height/2);
        inicio.setVisible(true);
        
        
        
           
    }
}
