package Config;

import java.sql.*;

public final class Config {
    private String host;
    private String password;
    private String db;
    private String driver;
    private Connection con;
    
    public Config(){
        this.db = "cidades";
        this.host= "root";
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
            }catch(SQLException sqlerr){
                throw new RuntimeException("Error url connection");
            }
        }catch(ClassNotFoundException err){
            throw new RuntimeException("Error in get connection with database ");
        }
    }
    
    public void closeConnection(Connection conn){
        if(conn == null){
            throw new RuntimeException("Error, connection is empty");
        }else{
            try{
                conn.close();
            }catch(SQLException err){
                throw new RuntimeException("Error in close connection ");
            }
        }
    }
    
    public void closeConnection(Connection conn, PreparedStatement ps){
        this.closeConnection(conn);
        
        if(ps == null){
            throw new RuntimeException("prepared statment is null");
        }else{
            try{
                ps.close();
            }catch(SQLException err){
                throw new RuntimeException("Error close prepared statment");
            }
        }
    }
    
    public void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs){
        this.closeConnection(conn, ps);
        
        if(rs == null){
            throw new RuntimeException("result set is null ");
        }else{
            try{
                rs.close();
            }catch(SQLException err){
                throw new RuntimeException("Error in close result set ");
            }   
        }
    }
}

