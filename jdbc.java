import java.sql.*;

public class jdbc {

   
    public static void main(String[] args)
    {
       
     
        try{
            String Query="select * from student where rollno=1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo","root","rushi5091");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(Query);
        rs.next();
        String sname=rs.getString(2);
        System.out.print(sname);
        con.close();
        }
        catch(Exception e)
        {
            
        }
    }
        
    
}
