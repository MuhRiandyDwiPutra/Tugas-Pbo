package id.bio.dao;

import id.bio.database.DatabaseMySQL;
import id.bio.model.Jurusan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JurusanDAOImpl implements JurusanDAO{
    @Override
    public boolean insert(Jurusan j) {
        String sql = "insert into jurusan values ( ?, ?)";
        try {
            PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);
            statement.setString(1, j.getId());
            statement.setString(2, j.getNama());
            int row = statement.executeUpdate();
            if(row > 0){
                return true;
            }
            statement.close();
        } catch (Exception ex) {
            Logger.getLogger(MahasiswaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Jurusan j) {
        String sql = "update jurusan set nama=? where id=?";
        try {
            PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);
            statement.setString(1, j.getNama());
            statement.setString(2, j.getId());
            int row = statement.executeUpdate();
            if(row > 0){
                return true;
            }
            statement.close();
        } catch (Exception ex) {
            Logger.getLogger(MahasiswaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(Jurusan j) {
        String sql = "delete from jurusan where id=?";
        try {   
            PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);
            statement.setString(1, j.getId());
            int row = statement.executeUpdate();
            if(row > 0){
                return true;
            }
            statement.close();
        } catch (Exception ex) {
            Logger.getLogger(MahasiswaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Jurusan> getAllJurusan() {
        List<Jurusan> categories = new ArrayList<Jurusan>();
        String sql = "select * from jurusan";
        try {
            if(DatabaseMySQL.getConnection()==null){ return null;
            }else{
                PreparedStatement statement = DatabaseMySQL.getConnection().prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                Jurusan c = new Jurusan(rs.getString(1),rs.getString(2));
                categories.add(c);
                }
                statement.close();
            }      
        } catch (Exception ex) {}
        return categories;
    }

    @Override
    public Jurusan getByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Jurusan> getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
