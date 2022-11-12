/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.sql.*;

public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ps21795_DangTheHuy_sof203_Demo_asm;encrypt=true;trustServerCertificate=true";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //tao 1 doi tuong connection
            
            Connection con =  DriverManager.getConnection(url,"sa","");
            // 2.tao 1 doi tuong de thi hanh` cau lenh sql
            Statement st = con.createStatement();
//            PreparedStatement ps = con.prepareStatement("select * from Users");
            //3. thi hanh cau lenh sql bo vao ResultSet
            ResultSet rs = st.executeQuery("select * from Users");
            //4. dung vong lap xuat tung dong ra
            while(rs.next()){
                //5. xuat ra man hinh
                System.out.println(rs.getString("Username")+" "+rs.getString("Password")+" "+rs.getString("role"));
            }
            // 6. do'ng ket noi lai.
            rs.close();
            st.close();
            con.close();
        }catch(Exception e){
            System.out.println(e);
//            e.printStackTrace();
        }
    }
    
}
