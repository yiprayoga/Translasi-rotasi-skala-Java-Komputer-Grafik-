
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
public class skala extends JPanel{ //Membuat canvas
    public static void main(String[] args){
        JFrame f = new JFrame("Skala");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        skala sk = new skala();
        f.getContentPane().add(sk);
        f.setSize(800,800);
        f.setBackground(Color.yellow);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){ // membuat isi canvas ( objek )
        Graphics2D g2d =(Graphics2D) g;
        g2d.setColor(Color.red);
        g2d.drawOval(20,20,20,20);
        g2d.scale(2,2);
        g2d.translate(10,10);
        g2d.setColor(Color.green);
        g2d.drawOval(20,20,20,20);
        g2d.scale(2,2);
        g2d.translate(10,10);
        g2d.setColor(Color.blue);
        g2d.drawOval(20,20,20,20);
        g2d.scale(2,2);
        g2d.translate(10,10);
        g2d.setColor(Color.red);
        g2d.drawOval(20,20,20,20);
        g2d.scale(2,2);
        g2d.translate(10,10);
    }
}
