package Controllers;

import java.util.ArrayList;
import java.sql.*;
import Config.Config;

public final class CidadesController {
    Config conf = new Config();
    
    public ArrayList<String> index(String sigla){
        Connection con = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = con.prepareStatement("SELECT * FROM cidade WHERE sigla = ?");
            ps.setString(1, sigla);
            
            rs = ps.executeQuery();
            
            ArrayList<String> city = new ArrayList<>();
            while(rs.next()){
                city.add(rs.getString("nome"));
            }
            
            return city;
        }catch(SQLException err){
            throw new RuntimeException("Error in get all cities with this state ");
        }finally{
            conf.closeConnection(con, ps, rs);
        }
    }
}
