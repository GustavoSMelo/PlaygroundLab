package Database;

import java.sql.*;

public final class Config {
    private String db;
    private String user;
    private String password;
    private Connection con;
    private String driver;
    
    public Config(){
        this.db = "mybankdata";
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
        }catch(SQLException ex ) {
           throw new RuntimeException("Error to connect a database ", ex);
        }
    }
    
    public void closeConnection(){
        if(this.con != null){
            try{
                
                this.con.close();
                
            }catch(SQLException e){
                System.err.println("Error to close connection ");
            }
        }else{
            System.err.println("Error, you dont have connection open for close ");
        }
    }
    
    public void closeConnection(PreparedStatement stmt){
        this.closeConnection();
        
        if(stmt != null){
            try{
                stmt.close();
            }catch(SQLException ex){
                System.err.println("Error to close stmt " + ex);
            }
        }else{
            System.err.println("stmt doesnt opened ");
        }
    }
    
    public void closeConnection(PreparedStatement stmt,ResultSet rs ){
        this.closeConnection(stmt);
        
        if(rs != null){
            try{
                rs.close();
            }catch(SQLException ex){
                System.err.println("Error to close ResultSet " + ex);
            }
        }else{
            System.err.println("ResultSet doesnt opened");
        }
    }
}

