package jav;
import java.sql.*;
public class Jav {
    public static void main(String[] arg)throws SQLException {
        Connection myCon=null;
        Statement mystmt=null;
        ResultSet myRs=null;
        
        try{
            myCon =DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","malik12579");
            mystmt=myCon.createStatement();
            myRs=mystmt.executeQuery("select * from student");
            while(myRs.next()){
                System.out.println(myRs.getString("name")+ "," +myRs.getString("class"));
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(myRs!=null){
                myRs.close();
                
            }
            if(mystmt!=null){
                mystmt.close();
                
            }
            if(myCon!=null){
                myCon.close();
            }
           
        }
    }
    
}