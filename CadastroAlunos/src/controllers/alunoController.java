package controllers;

import database.Config;
import java.sql.*;
import java.util.ArrayList;
import models.alunos;

public final class alunoController {
    Config conf;
    public alunoController(){
        conf = new Config();
    }
    
    public void store(alunos Student) throws ClassNotFoundException{
        
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("insert into alunos (rgm, nome, idade, curso) values (?,?,?,?)");
            ps.setString(1, Student.getRGM());
            ps.setString(2, Student.getNome());
            ps.setInt(3, Student.getIdade());
            ps.setString(4, Student.getCurso());
            
            ps.executeUpdate();
        }catch(SQLException err){
            throw new RuntimeException("Error in store a new student " + err);
        }finally{
            conf.closeConnection(conn, ps);
        }
        
    }
    
    public ArrayList<alunos> index(alunos Student) throws ClassNotFoundException{
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = conn.prepareStatement("select * from alunos where curso = ?");
            ps.setString(1, Student.getCurso());
            rs = ps.executeQuery();
            
            ArrayList<alunos> list_of_students = new ArrayList<>();
            
            while(rs.next()){
                alunos aluno = new alunos(rs.getString("RGM"), rs.getString("nome"), rs.getInt("idade"), rs.getString("curso"));
                
                list_of_students.add(aluno);
            }
            
            return list_of_students;
            
            
        }catch(SQLException err){
            throw new RuntimeException("Error to list students "+ err);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
    
    public void update(alunos Student) throws ClassNotFoundException{
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("update alunos set rgm = (?), nome = ?, idade = ?, curso = ? where rgm = ?");
            ps.setString(1, Student.getRGM());
            ps.setString(2, Student.getNome());
            ps.setInt(3, Student.getIdade());
            ps.setString(4, Student.getCurso());
            ps.setString(5, Student.getRGM());
            
            ps.executeUpdate();
        }catch(SQLException error){
            throw new RuntimeException("Error to update a student" + error);
        }finally{
            conf.closeConnection(conn, ps);
        }
    }
    
    public void destroy(alunos Student) throws ClassNotFoundException{
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("delete from alunos where RGM = ?");
            ps.setString(1, Student.getRGM());
            ps.executeUpdate();
            
        }catch(SQLException error){
            throw new RuntimeException("Error to delete a student");
        }finally{
            conf.closeConnection(conn, ps);
        }
    }
}
