/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author Aryan Soft
 */
public class connectionProvider {
    public static Connection getCon(){
     try{
         class.forName=("com.mysql.jdbc.Driver");
         
     }
         
     }catch(Exception e){
         return null;
     }
}
