
package Controllers;

import java.sql.*;
import Models.EstadoModel;
import Config.Config;
import java.util.ArrayList;

public final class EstadoController {
    Config conf = new Config();
    
    public EstadoController(){}
    
    public ArrayList<EstadoModel> index(){
        Connection con = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = con.prepareStatement("SELECT * FROM estado");
            rs = ps.executeQuery();
            
            ArrayList<EstadoModel> em = new ArrayList<>();
            
            while(rs.next()){
                EstadoModel tmp = new EstadoModel(rs.getString("sigla"), rs.getString("nome"));
                em.add(tmp);
            }
            
            return em;
            
        }catch(SQLException err){
            throw new RuntimeException("Error in get all states ");
        }finally{
            conf.closeConnection(con, ps, rs);
        }
    }
}
