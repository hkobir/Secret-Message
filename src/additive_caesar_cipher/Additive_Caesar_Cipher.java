/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additive_caesar_cipher;

import static additive_caesar_cipher.file_ReadWrite.readreg;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author Hkobir
 */
public class Additive_Caesar_Cipher extends Application {
    
public  String register="";
private Path filePath;

    // makes a read function for register file 
         
  





    
    @Override
public void start(Stage stage) throws IOException {
    filePath =Paths.get("register.txt");
     if(Files.exists(filePath)){
         register=readreg();
           if(register.equals("no")||register.isEmpty()){
                Parent root=FXMLLoader.load(getClass().getResource("registration.fxml"));
        //stage.initStyle(StageStyle.UNDECORATED);
        
        Scene scne=new Scene(root);
        stage.setScene(scne);
        stage.show();
         }
         else{
         Parent root=FXMLLoader.load(getClass().getResource("Login.fxml"));
        //stage.initStyle(StageStyle.UNDECORATED);
       // Stage s3=new Stage();
        Scene scne=new Scene(root);
       stage.setScene(scne);
        stage.show();
         }
         
         
         
         
         
         
     }
        else{
            //create register file first time otherwise couldnt find for check
            //initially create text file into as application destination
        
        Parent root=FXMLLoader.load(getClass().getResource("registration.fxml"));
       //stage.initStyle(StageStyle.UNDECORATED);
       //Stage s=new Stage();
        Scene scne=new Scene(root);
        stage.setScene(scne);
        stage.show();
          
        }
    
    
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
