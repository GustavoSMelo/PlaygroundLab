package Controllers;

import Database.Config;
import Models.GeneroModel;
import java.util.ArrayList;
import java.sql.*;

public final class GeneroController {
    public GeneroController(){}
    Config conf = new Config();
    
    public ArrayList index(){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = conn.prepareStatement("SELECT * FROM generos");
            rs = ps.executeQuery();
            
            ArrayList<GeneroModel> allGeneros = new ArrayList<>();
            
            while(rs.next()){
                GeneroModel gen = new GeneroModel(rs.getString("genero"));
                allGeneros.add(gen);
            }
            
            return allGeneros;
        } catch (SQLException e) {
            throw new RuntimeException("Error to consult database "+ e);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
}
