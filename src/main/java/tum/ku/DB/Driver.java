package tum.ku.DB;

import java.sql.*;

public class Driver {
    public static void main(String[] args) {
        String user = "admin02";
        String pass = "password";
        String url = "jdbc:mysql://localhost/expense";

        try{
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/expense","admin02","password");

            Statement myStmt = conn.createStatement();


            String s = "mava";

//            String sql2 = "insert into users (username,password,firstname,lastname )"+
//                    "values('testza','5678','" + s + "','za')";
            String sql3 = "insert into expensetable (description,money,type)"+
                    "values('"+ s + "','"+ 1000 +"','" + "'income'"+")";

            myStmt.executeUpdate(sql3);

            ResultSet myRs = myStmt.executeQuery("Select * from expensetable");

            while (myRs.next()){
                System.out.println(myRs.getString("ID")+ " " + myRs.getString("description")+" "
                        +  myRs.getString("money")+" "+ myRs.getString("type"));
            }
        }
        catch (SQLException exc){
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
