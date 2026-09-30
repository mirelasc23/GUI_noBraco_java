package exemplo2;

import java.awt.*;
import javax.swing.*;
 
public class Tela{
  
 private JFrame tela;
  
  
 public Tela(){
  
 inicia();
 }
  
  
 public void inicia(){
  
 tela = new JFrame();
 tela.setVisible(true);
 tela.setTitle("Tela Principal");
 tela.setSize(800,600);
 tela.setLocationRelativeTo(null);
 tela.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  
}
 
 public static void main (String [] args){
  
 new Tela();
 }
}