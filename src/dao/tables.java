/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Aryan Soft
 */
public class tables {
    public static void main(Stirng[] args){
        try{
            String userTable="create table user(id int AUTO_INCRERMENT primary key, name Varchar(200),email varchar(200),mobileNumber varcher(10),address varchar (200), password varchar (200), securityQuestion varchar(200),answer varchar(200),statuse varchar(20)UNIQUE(email))";
          DbOperation.setDataorDelete()
        
        }catch(Exception e){
            Joptionpane.showMassgeDialog(null,e);
        
        }
        
    }
}
