package Controllers;

import java.sql.*;
import Models.CDSModel;
import Database.Config;
import Models.GeneroModel;
import java.util.ArrayList;

public final class CDSController {
    public CDSController(){}
    
    Config conf = new Config();
    
    public ArrayList index(){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = conn.prepareStatement("SELECT * FROM cds");
            rs = ps.executeQuery();
            
            ArrayList<CDSModel> allCDS = new ArrayList<>();
            
            while(rs.next()){
                CDSModel cds = new CDSModel(rs.getInt("codigo"), rs.getString("titulo"), rs.getString("interprete"), (GeneroModel) rs.getObject("genero"), rs.getFloat("preco"));
                
                allCDS.add(cds);
            }
            
            return allCDS;
        }catch(SQLException err){
            throw new RuntimeException("Error to consult database " + err);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
    
    public ArrayList show(CDSModel CD){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = conn.prepareStatement("SELECT * FROM cds WHERE genero = ?");
            GeneroModel virtual = new GeneroModel(CD.getGenero().toString());
            ps.setString(1, virtual.getGenero());
            rs = ps.executeQuery();
            
            ArrayList<CDSModel> allCDS = new ArrayList<>();
            GeneroModel tmp = new GeneroModel();
            
            while(rs.next()){
                tmp.setGenero(rs.getString("genero"));
                CDSModel cds = new CDSModel(rs.getInt("codigo"), rs.getString("titulo"), rs.getString("interprete"), tmp, rs.getFloat("preco"));
                allCDS.add(cds);
            }
            
            return allCDS;
        }catch(SQLException err){
            throw new RuntimeException("Error in consult database "+ err);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
}
