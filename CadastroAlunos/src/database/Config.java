package database;

import java.sql.*;

public final class Config {
    private String db;
    private String user;
    private String password;
    private Connection con;
    private String driver;
    
    public Config(){
        this.db = "escola3";
        this.user = "root";
        this.password = "";
        this.driver = "com.mysql.cj.jdbc.Driver";
    }
    
    public Connection getConnection() throws ClassNotFoundException{
        Class.forName(driver);
        
        String url = "jdbc:mysql://localhost:3306/"+this.db+"?useTimezone=true&serverTimezone=UTC";
        
        try{
            this.con = DriverManager.getConnection(url, this.user, this.password);
            return this.con;
        }catch(SQLException error){
            throw new RuntimeException("Error in connection SQL " + error );
        }
    }
    
    public void closeConnection(Connection con){
        if(con != null){
            try{
                con.close();
            }
            catch(SQLException ex){
                throw new RuntimeException("Error in close Connection! " + ex);
            }
            
        }else{
            throw new RuntimeException("Error, You dont have any connection opened ");
        }
    }
    
    public void closeConnection(Connection con, PreparedStatement ps){
        closeConnection(con);
        try{
            if(ps != null){
                ps.close();
            } 
        }catch(SQLException ex){
            throw new RuntimeException("You dont have any PreparedStatement opened ");
        }
    }
    
    public void closeConnection(Connection con, PreparedStatement ps, ResultSet rs){
        closeConnection(con, ps);
        
        try{
            if(rs != null){
                rs.close();
            }
        }catch(SQLException err){
            throw new RuntimeException("You dont have any ResultSet opened ");
        }
    }
}
