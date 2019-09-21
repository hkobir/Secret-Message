/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additive_caesar_cipher;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Hkobir
 */
public class Additive_cipherController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField message,display;
  
    
    
    //convert to ciphertext as sender
   
    
   int key=17;
   int a=0,b=1,c=2,d=3,e=4,f=5,g=6,h=7,i=8,j=9,k=10,l=11,m=12,n=13,o=14,p=15,q=16,r=17,s=18,t=19,u=20,v=21,w=22,x=23,y=24,z=25;

   
    public void encrypt(ActionEvent event){
        String text=message.getText();
        char[] plain=text.toCharArray();
        int cnumber=0;
        if(text.isEmpty()){
            JOptionPane.showMessageDialog(null,"Empty field!");
        }
        else{
            for(int I=0;I<plain.length;I++){
                if(plain[I]=='a'){
                    
                   // additive cipher with adding key and cipher
                    cnumber=(a+key)%26;
                    
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                    
                    
                }
                else if(plain[I]=='b'){
                    
                    // additive cipher with adding key and cipher
                    cnumber=(b+key)%26;
                    
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                
                else if(plain[I]=='c'){
                    cnumber=(c+key)%26;
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='d'){
                    cnumber=(d+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='e'){
                    cnumber=(e+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='f'){
                    cnumber=(d+key)%26;
                    
                     //check cIpher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='g'){
                    cnumber=(g+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='h'){
                    cnumber=(h+key)%26;
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='i'){
                    cnumber=(i+key)%26;
                    System.out.println(cnumber);
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='j'){
                    cnumber=(j+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='k'){
                    cnumber=(k+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
        else if(plain[I]=='l'){
                    cnumber=(l+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='m'){
                    cnumber=(m+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='n'){
                    cnumber=(n+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='o'){
                    cnumber=(o+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='p'){
                    cnumber=(p+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='q'){
                    cnumber=(q+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='r'){
                    cnumber=(r+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='s'){
                    cnumber=(s+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='t'){
                    cnumber=(t+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='u'){
                    cnumber=(u+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='v'){
                    cnumber=(v+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='w'){
                    cnumber=(w+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='x'){
                    cnumber=(x+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='y'){
                    cnumber=(y+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else if(plain[I]=='z'){
                    cnumber=(z+key)%26;
                    
                     //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='A';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='B';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='C';
                    }
                    else if(cnumber==3){
                        plain[I]='D';
                    }
                    else if(cnumber==4){
                        plain[I]='E';
                    }
                    else if(cnumber==5){
                        plain[I]='F';
                    }
                    else if(cnumber==6){
                        plain[I]='G';
                    }
                    else if(cnumber==7){
                        plain[I]='H';
                    }
                    else if(cnumber==8){
                        plain[I]='I';
                    }
                    else if(cnumber==9){
                        plain[I]='J';
                    }
                    else if(cnumber==10){
                        plain[I]='K';
                    }
                    else if(cnumber==11){
                        plain[I]='L';
                    }
                    else if(cnumber==12){
                        plain[I]='M';
                    }
                    else if(cnumber==13){
                        plain[I]='N';
                    }
                    else if(cnumber==14){
                        plain[I]='O';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='P';
                    }
                    else if(cnumber==16){
                        plain[I]='Q';
                    }
                    else if(cnumber==17){
                        plain[I]='R';
                    }
                    else if(cnumber==18){
                        plain[I]='S';
                    }
                    else if(cnumber==19){
                        plain[I]='T';
                    }
                    else if(cnumber==20){
                        plain[I]='U';
                    }
                    else if(cnumber==21){
                        plain[I]='V';
                    }
                    else if(cnumber==22){
                        plain[I]='W';
                    }
                    else if(cnumber==23){
                        plain[I]='X';
                    }
                    else if(cnumber==24){
                        plain[I]='Y';
                    }
                    else{
                        plain[I]='Z';
                    }
                }
                else{
                    plain[I]=' ';
                }
                
            }
        }
        
        for(int I=0;I<plain.length;I++){
        display.setText(String.copyValueOf(plain));
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    //dycription
    
    
    
    
    
    
    
    
    
    //convert to plaintext as recipent
    
     public void decrypt(ActionEvent event){
         String text=message.getText();
        char[] plain=text.toCharArray();
        int cnumber=0;
        if(text.isEmpty()){
            JOptionPane.showMessageDialog(null,"Empty field!");
        }
        else{
                        for(int I=0;I<plain.length;I++){
                if(plain[I]=='A'){
                    
                   // additive cipher with adding key and cipher
                    cnumber=(a-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                    
                    
                }
                else if(plain[I]=='B'){
                    
                     // additive cipher with adding key and cipher
                             cnumber=(b-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                
                else if(plain[I]=='C'){
                     // additive cipher with adding key and cipher
                             cnumber=(c-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='D'){
                     // additive cipher with adding key and cipher
                             cnumber=(d-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='E'){
                     // additive cipher with adding key and cipher
                             cnumber=(e-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='F'){
                     // additive cipher with adding key and cipher
                             cnumber=(f-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='G'){
                     // additive cipher with adding key and cipher
                            cnumber=(g-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='H'){
                     // additive cipher with adding key and cipher
                            cnumber=(h-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='I'){
                     // additive cipher with adding key and cipher
                            cnumber=(i-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='J'){
                     // additive cipher with adding key and cipher
                            cnumber=(j-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='K'){
                     // additive cipher with adding key and cipher
                           cnumber=(k-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='L'){
                            cnumber=(l-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='M'){
                     // additive cipher with adding key and cipher
                             cnumber=(m-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='N'){
                     // additive cipher with adding key and cipher
                             cnumber=(n-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='O'){
                     // additive cipher with adding key and cipher
                            cnumber=(o-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='P'){
                     // additive cipher with adding key and cipher
                             cnumber=(p-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='Q'){
                     // additive cipher with adding key and cipher
                            cnumber=(q-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='R'){
                     // additive cipher with adding key and cipher
                           cnumber=(r-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='S'){
                     // additive cipher with adding key and cipher
                             cnumber=(s-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='T'){
                     // additive cipher with adding key and cipher
                             cnumber=(t-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='U'){
                     // additive cipher with adding key and cipher
                            cnumber=(u-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='V'){
                     // additive cipher with adding key and cipher
                             cnumber=(v-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='W'){
                     // additive cipher with adding key and cipher
                             cnumber=(w-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='X'){
                     // additive cipher with adding key and cipher
                            cnumber=(x-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='Y'){
                     // additive cipher with adding key and cipher
                            cnumber=(y-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else if(plain[I]=='Z'){
                    // additive cipher with adding key and cipher
                             cnumber=(z-key);       //if value would be negative
                    while(cnumber<0){
                        cnumber=cnumber+26;
                    }
                    cnumber=(cnumber%26);
                    //check cipher letter after substitution
                    if(cnumber==0){
                        plain[I]='a';
                    }
                    
                    else if(cnumber==1){
                        plain[I]='b';
                    }
                    
                    
                    else if(cnumber==2){
                        plain[I]='c';
                    }
                    else if(cnumber==3){
                        plain[I]='d';
                    }
                    else if(cnumber==4){
                        plain[I]='e';
                    }
                    else if(cnumber==5){
                        plain[I]='f';
                    }
                    else if(cnumber==6){
                        plain[I]='g';
                    }
                    else if(cnumber==7){
                        plain[I]='h';
                    }
                    else if(cnumber==8){
                        plain[I]='i';
                    }
                    else if(cnumber==9){
                        plain[I]='j';
                    }
                    else if(cnumber==10){
                        plain[I]='k';
                    }
                    else if(cnumber==11){
                        plain[I]='l';
                    }
                    else if(cnumber==12){
                        plain[I]='m';
                    }
                    else if(cnumber==13){
                        plain[I]='n';
                    }
                    else if(cnumber==14){
                        plain[I]='o';
                    }
                    
                   else if(cnumber==15){
                        plain[I]='p';
                    }
                    else if(cnumber==16){
                        plain[I]='q';
                    }
                    else if(cnumber==17){
                        plain[I]='r';
                    }
                    else if(cnumber==18){
                        plain[I]='s';
                    }
                    else if(cnumber==19){
                        plain[I]='t';
                    }
                    else if(cnumber==20){
                        plain[I]='u';
                    }
                    else if(cnumber==21){
                        plain[I]='v';
                    }
                    else if(cnumber==22){
                        plain[I]='w';
                    }
                    else if(cnumber==23){
                        plain[I]='x';
                    }
                    else if(cnumber==24){
                        plain[I]='y';
                    }
                    else{
                        plain[I]='z';
                    }
                }
                else{
                    plain[I]=' ';
                }
                
            }
        }
        
        for(int I=0;I<plain.length;I++){
        display.setText(String.copyValueOf(plain));
        }
        }
    
    
    //clear the textbox..
     public void clear(ActionEvent event){
        message.setText(" ");
        display.setText(" ");
    }
    
    
     public void About(ActionEvent event) throws IOException{
         
        Parent root=FXMLLoader.load(getClass().getResource("about.fxml"));
        //stage.initStyle(StageStyle.UNDECORATED);
        Stage stage=new Stage();
        Scene scne=new Scene(root);
        stage.setScene(scne);
        stage.show();
    }
    
     public void Close(ActionEvent event){
        System.exit(0);
    }
     public void ChangePass(ActionEvent event) throws IOException{
         ((Node)event.getSource()).getScene().getWindow().hide(); 
         Parent root=FXMLLoader.load(getClass().getResource("registration.fxml"));
        //stage.initStyle(StageStyle.UNDECORATED);
        Stage s2=new Stage();
        Scene scne=new Scene(root);
        s2.setScene(scne);
        s2.show();
     }
     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
