package Basic.other;
/*
it helps in section b/w a java app and db
some commely used method are
statment createStatment
void rollBack
set autoComitte


statement interface it provide method execute query with db
some commenly used method are
resultSet executeQuery(string)
int executeUpdate(string)
boolean execute(string)

result set interface it is used to execute a query that
it maintain data in 2d table the object in mainset maintain the row of a table
initial curser points at first row by default result set object is move forward only it is
not updateable
boolean next
 */

import java.sql.*;
public class connection {

}
/*
try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establishing Connection
            Connection con = DriverManager.getConnection(
             "jdbc:oracle:thin:@localhost:1521:orcl", "login1", "pwd1");

            if (con != null)
                System.out.println("Connected");
            else
                System.out.println("Not Connected");

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
 */