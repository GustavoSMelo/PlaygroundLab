package Controllers;

import Database.Config;
import java.sql.*;
import Models.ProdutoModel;
import java.util.ArrayList;

public final class ProdutoController {
    Config conf = new Config();
    
    public ProdutoController(){}
    
    public void Store(ProdutoModel prod) throws ClassNotFoundException{
        Connection con = conf.getConnection();
        PreparedStatement stmt = null;
        
        try{
           
            
            stmt = con.prepareStatement("INSERT INTO produtos (name_prod, price_prod, cod_bar, productor_prod)"
                    + " VALUES (?,?,?,?)");
            stmt.setString(1, prod.getName_prod());
            stmt.setFloat(2, prod.getPrice_prod());
            stmt.setInt(3, prod.getCod_bar());
            stmt.setString(4, prod.getProductor_prod());
            stmt.executeUpdate();
            
            System.out.println("Product inserted with success! ");
            
        }catch(SQLException err){
            System.err.println("Error to getConnection to make operation in database ! " + err);
        }finally{
           conf.closeConnection(stmt);
        }
        
    }
    
    public void Index() throws ClassNotFoundException{
        Connection con = conf.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            stmt = con.prepareStatement("select * from produtos");
            rs = stmt.executeQuery();
            while(rs.next()){
                ProdutoModel prod = new ProdutoModel(rs.getInt("id"),
                        rs.getString("name_prod"),
                        rs.getFloat("price_prod"),
                        rs.getInt("cod_bar"),
                        rs.getString("productor_prod"));
                
                System.out.println(prod.toString() + "\n");
            }            
        }catch(SQLException ex){
            System.err.println("Error to getConnection to make operation in database! "+ex);
        }finally{
            conf.closeConnection(stmt, rs);
        }
        
    }
    
    public void Update(ProdutoModel prod) throws ClassNotFoundException{
        Connection con = conf.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("Update produtos set name_prod = ?, price_prod =?,"
                    + " cod_bar =?, productor_prod =?"
                    + "where id = ?");
            stmt.setString(1, prod.getName_prod());
            stmt.setFloat(2, prod.getPrice_prod());
            stmt.setInt(3, prod.getCod_bar());
            stmt.setString(4, prod.getProductor_prod());
            stmt.setInt(5, prod.getId());
            
            stmt.executeUpdate();
            System.out.println("Product updated with success! ");
        }catch(SQLException ex){
            System.err.println("Error to getConnection to make operation in database! "+ ex);
        }finally{
            conf.closeConnection(stmt);
        }
    }
    
    public void Destroy(ProdutoModel prod) throws ClassNotFoundException{
        Connection con = conf.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("Delete from produtos where id = ?");
            stmt.setInt(1, prod.getId());
            stmt.executeUpdate();
            
            System.out.println("Produto removido com sucesso! ");
        }catch(SQLException ex){
            System.err.println("Error to getConnection to make operation in database! "+ ex);
        }finally{
            conf.closeConnection(stmt);
        }
        
    }
}
