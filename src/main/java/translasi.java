
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yulian
 */

public class translasi extends JPanel{
        public static void main(String[] args){
            JFrame f = new JFrame("Translasi");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            translasi ts=new translasi();
            f.getContentPane().add(ts);
            f.setSize(800,800);
            f.setBackground(Color.yellow);
            f.setVisible(true);
        }
        
        public void paintComponent(Graphics g){
            Graphics2D g2d=(Graphics2D)g;
     
            g2d.setColor(Color.pink);
            g2d.fillRect(20,20,80,50);
            g2d.translate(100,100);
            g2d.setColor(Color.blue);
            g2d.fillRect(20,20,80,50);
            g2d.translate(120,100);
            g2d.setColor(Color.gray);
            g2d.fillRect(20,20,80,50);
            g2d.translate(100,100);
            g2d.setColor(Color.cyan);
            g2d.fillRect(20,20,80,50);
            g2d.translate(120,100);
            g2d.setColor(Color.green);
            g2d.fillRect(20,20,80,50);
            g2d.translate(120,100);
        }
        
}