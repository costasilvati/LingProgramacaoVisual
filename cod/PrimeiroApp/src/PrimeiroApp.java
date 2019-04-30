/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 * @author usuario
 */
public class PrimeiroApp {
    // Construtor
    public PrimeiroApp(){
        JFrame jfrm = new JFrame("O programa");
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Texto que será exibido
        JLabel jlab = new JLabel("Um texto");
        //Adicione o texto ao seu Frame
        jfrm.getContentPane().add(jlab);
        //Exibir o Frame
        jfrm.setVisible(true);
    }
    
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new PrimeiroApp();
            }
        });
    }
}
