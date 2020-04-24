package Database;

import java.sql.*;

public final class Config {
    private String db;
    private String host;
    private String password;
    private String driver;
    private Connection con;
    
    public Config(){
        this.db = "lojacds";
        this.host="root";
        this.password = "";
        this.driver = "com.mysql.cj.jdbc.Driver";
    }
    
    public Connection getConnection(){
        try{
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/"+this.db+"?useTimezone=true&serverTimezone=UTC";
            try{
                this.con = DriverManager.getConnection(url, this.host, this.password);
                
                return this.con;
            }catch(SQLException error){
                throw new RuntimeException("Error in getConnection with database "+ error);
            }
        }catch(ClassNotFoundException err){
            throw new RuntimeException("Error in driver: (ClassNotFoundException) "+ err);
        }
    }
    
    public void closeConnection(Connection con){
        if(con == null){
            System.err.println("You dont have any connection opened ");
        }else{
            try {
                con.close();
            } catch (Exception e) {
                throw new RuntimeException("Error in close connenction " + e);
            }
        }
    }
    
    public void closeConnection(Connection con, PreparedStatement ps){
        this.closeConnection(con);
        
        if(ps == null){
            System.err.println("You dont have any prepared statement opened ");
        }else{
            try {
                ps.close();
            } catch (Exception e) {
                throw new RuntimeException("Error in close connenction " + e);
            }
        }
    }
    
    public void closeConnection(Connection con, PreparedStatement ps, ResultSet rs){
        this.closeConnection(con, ps);
        
        if(rs == null){
            System.err.println("You dont have any result set opened ");
        }else{
            try {
                rs.close();
            } catch (Exception e) {
                throw new RuntimeException("Error in close connenction " + e);
            }
        }
    }
}
