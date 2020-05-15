package Controllers;

import java.sql.*;
import Models.AlunoModel;
import Config.Config;
import javax.swing.JOptionPane;

public final class AlunoController {
    Config conf = new Config();
    public AlunoController(){}
    
    public void store(AlunoModel aluno){
        Connection con = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = con.prepareStatement("SELECT * FROM aluno WHERE RGM = ?");
            ps.setString(1, aluno.getNome());
            rs = ps.executeQuery();
            
            if(!rs.next()){
               ps = con.prepareStatement("INSERT INTO aluno (rgm, nome, endereco, cidade, estado) VALUES (?, ?, ?, ?, ?)");
               ps.setString(1, aluno.getRGM());
               ps.setString(2, aluno.getNome());
               ps.setString(3, aluno.getEndereco());
               ps.setString(4, aluno.getCidade());
               ps.setString(5, aluno.getEstado());
               
               ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student inserted with success ");
            }else{
                JOptionPane.showMessageDialog(null, "student already exists in database ");
            }
        }catch(SQLException err){
            throw new RuntimeException("Error in store student");
        }finally{
            conf.closeConnection(con, ps, rs);
        }
    }
    
    public void destroy(AlunoModel aluno){
        Connection con = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = con.prepareStatement("SELECT * FROM aluno WHERE RGM = ?");
            ps.setString(1, aluno.getRGM());
            rs = ps.executeQuery();
            
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "this student does not exists ");
            }else{
                ps = con.prepareStatement("DELETE FROM aluno WHERE RGM = ?");
                ps.setString(1, aluno.getRGM());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student deleted with success ");
            }
        }
        catch(SQLException err){
            throw new RuntimeException("Error in destroy student");
        }finally{
            conf.closeConnection(con, ps, rs);
        }
    }
    
    public void update(AlunoModel aluno){
        Connection con = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = con.prepareStatement("SELECT * FROM aluno WHERE RGM = ?");
            ps.setString(1, aluno.getRGM());
            rs = ps.executeQuery();
            
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "this student does not exists ");
            }else{
                ps = con.prepareStatement("UPDATE aluno SET nome= ?, endereco = ?, cidade = ?, estado = ? WHERE rgm = ?");
                ps.setString(1, aluno.getNome());
                ps.setString(2, aluno.getEndereco());
                ps.setString(3, aluno.getCidade());
                ps.setString(4, aluno.getEstado());
                ps.setString(5, aluno.getRGM());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student updated with success ");
            }
        }
        catch(SQLException err){
            throw new RuntimeException("Error in destroy student");
        }finally{
            conf.closeConnection(con, ps, rs);
        }
    }
}
