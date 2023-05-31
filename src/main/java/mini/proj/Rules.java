/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mini.proj;

/**
 *
 * @author prave
 */


import mini.proj.Quiz;
import mini.proj.Javaproj;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(600, 200, 800, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome to JAVA QUIZ ," + username);
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        l1.setBounds(50, 20, 700, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(20, 90, 600, 350);
        l2.setText(
            "<html>"+ 
               "1.You will have multiple attempts for this quiz with your highest score being recorded in the grade book. " + "<br><br>" +
                "2.The quiz consists of 10 questions in total" + "<br><br>" +
                "3. You will need to complete each of your attempts in one sitting, as you are allotted 15 seconds to complete each attempt." + "<br><br>" +
                "4.One main thing to be remembered is that the questions cannot be revisited back and forth." + "<br><br>" +
                "5.The question panel moves to the next question once the timer ends" + "<br><br>" +
                "6.To start, click the Start button. When finished,click the Submit button" + "<br><br>" +
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250, 500, 100, 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Start");
        b2.setBounds(400, 500, 100, 30);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new Javaproj().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules("");
    }
}

