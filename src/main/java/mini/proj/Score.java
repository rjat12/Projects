/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mini.proj;

/**
 *
 * @author prave
 */


import mini.proj.Javaproj;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String username, int score){
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("mini/code/icons/score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 200, 300, 250);
        add(l1);
        /*
        JLabel l2 = new JLabel("Thankyou " + username + " for attending JAVA QUIZ");
        l2.setBounds(500, 30, 700, 30);
        l2.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        add(l2);
        */
        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(500, 200, 300, 30);
        l3.setFont(new Font("Mongolian Baiti", Font.PLAIN, 26));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        
        JButton b1 = new JButton("Play Again");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        
        b1.setBounds(500, 270, 120, 30);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Javaproj().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }
}
