/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exjunej3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author ANDRESLF
 */
public class Exjunej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          JFileChooser jfc= new JFileChooser();
          long cont=0; // elegimos long porque el fichero puede ser muy largo
            int resultado = jfc.showOpenDialog(jfc);
              if (resultado == JFileChooser.APPROVE_OPTION ){
                  if(jfc.getSelectedFile().toString().endsWith(".txt")){
                      try {
                          File f=jfc.getSelectedFile();
                          Scanner ler= new Scanner(f);
                          while (ler.hasNext()){
                                String linea = ler.nextLine();
             
            System.out.println(cont + ": " + linea);
            cont++;
                        
                      }
                          System.out.println(cont);
                      } catch (FileNotFoundException ex) {
                          Logger.getLogger(Exjunej3.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
                  else{
                      System.out.println("o ficheiro "+ jfc.getSelectedFile().toString()+" non e correcto");
                  }
              }
    }
    
}
