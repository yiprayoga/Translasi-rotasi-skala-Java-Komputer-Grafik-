
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
public class rotate extends JPanel{ //Membuat canvas
    public static void main(String[] args){
        JFrame f = new JFrame("Skala");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rotate sk = new rotate();
        f.getContentPane().add(sk);
        f.setSize(800,800);
        f.setBackground(Color.yellow);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){ // membuat isi canvas ( objek )
        Graphics2D g2d =(Graphics2D) g;
        g2d.setColor (Color.MAGENTA);
        g2d.fillRect(20,20,80,50);
        
        g2d.setColor (Color.cyan);
        g2d.translate(180,5);
        g2d.rotate(Math.PI/4);
        g2d.fillRect(20,20,80,50);
        
        g2d.setColor (Color.gray);
        g2d.translate(180,5);
        g2d.rotate(Math.PI/4);
        g2d.fillRect(20,20,80,50);
         
        g2d.setColor (Color.blue);
        g2d.translate(180,5);
        g2d.rotate(Math.PI/4);
        g2d.fillRect(20,20,80,50);
        
        g2d.setColor (Color.green);
        g2d.translate(180,5);
        g2d.rotate(Math.PI/4);
        g2d.fillRect(20,20,80,50);
    }
}

