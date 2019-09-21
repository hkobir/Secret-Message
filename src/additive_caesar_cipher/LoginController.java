/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additive_caesar_cipher;

import static additive_caesar_cipher.file_ReadWrite.readpass;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Hkobir
 */
public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private PasswordField pas;
    
    
    @FXML
    private void login(ActionEvent event){
         String database_pass=readpass();
        String p=pas.getText().trim();
        
         if(p.isEmpty()){
            JOptionPane.showMessageDialog(null, "empty field!");
        }
        else if(p.equals(database_pass)){
            try {
                //JOptionPane.showMessageDialog(null, "login successful!");
                ((Node)event.getSource()).getScene().getWindow().hide();       //hide current window
                Parent root=FXMLLoader.load(getClass().getResource("additive_cipher.fxml"));
                //stage.initStyle(StageStyle.UNDECORATED);
                Stage s3=new Stage();
                Scene scne=new Scene(root);
                s3.setScene(scne);
                s3.show();
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "incorrect password!");
            pas.setText("");;
           
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
