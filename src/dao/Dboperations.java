/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.Joptionpane;
import java.sql.*;
/**
 *
 * @author Aryan Soft
 */
public class Dboperations {
    public static void setDataoraDelete(String Query,String msg){
        try{
          Connection con=ConnectionProvider.getCon(){
            Statement st=con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""));
            Joptionpane.showMassageDialog(null,msg);
        }  
        }catch(Exception e){
            Joptionpane.showMassegeDialog(null,e,"Massage",Joptionpane.ERROR_MASSAGES);
        }
    }
}
