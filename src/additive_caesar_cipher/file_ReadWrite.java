/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additive_caesar_cipher;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Hkobir
 */
public  class file_ReadWrite {
         public static void writereg(String text){
        try (FileWriter fw = new FileWriter("register.txt")) {
              BufferedWriter bw = new BufferedWriter(fw);
              bw.write(text);
              bw.close();
          } catch (IOException ex) {
                System.out.println(ex);
            }
    }
          public static String readreg(){
             
             String text="";
               Scanner s1=null;
        try {
            FileInputStream ob= new FileInputStream("register.txt");
            s1=new Scanner(ob);
            //s1=new Scanner(new FileInputStream("d:\\log.txt"));
        } catch (FileNotFoundException ex) {
           System.out.print(ex);
        }
         while(s1.hasNext()) {
          text=s1.nextLine();   //for whole string
          //text=s1.next();     //only a word is took without space(null)
         }
             
             
          return text;   
         }
    
            // makes a write function for password file 
    
         public static void writepass(String text){
        try (FileWriter fw = new FileWriter("pass.txt")) {
              BufferedWriter bw = new BufferedWriter(fw);
              bw.write(text);
              bw.close();
          } catch (IOException ex) {
                System.out.println(ex);
            }
    }
    // makes a read function for passwordr file 
         
         public static String readpass(){
             
             String text="";
               Scanner s1=null;
        try {
            FileInputStream ob= new FileInputStream("pass.txt");
            s1=new Scanner(ob);
            //s1=new Scanner(new FileInputStream("d:\\log.txt"));
        } catch (FileNotFoundException ex) {
           System.out.print(ex);
        }
         while(s1.hasNext()) {
          text=s1.nextLine();   //for whole string
          //text=s1.next();     //only a word is took without space(null)
         }
             
             
          return text;   
         }
    
}
