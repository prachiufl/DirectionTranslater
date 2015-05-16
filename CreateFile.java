
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prachim89
 */
public class CreateFile {
    int count = 2;
  
   public void SaveAs(JTextArea n) {

      File fileName = new File("Translater.txt");
      BufferedWriter outFile = null;
      try {
         outFile = new BufferedWriter(new FileWriter(fileName,true));

         n.write(outFile);
         outFile.newLine();
         System.out.println("write successful");

      } catch (IOException ex) {
         ex.printStackTrace();
      } finally {
         if (outFile != null) {
            try {
               outFile.close();
            } catch (IOException e) {
               System.out.println("Error while riting to a file");
            }
         }
      }
   }
}
