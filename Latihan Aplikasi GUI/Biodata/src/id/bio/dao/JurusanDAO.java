package id.bio.dao;

import id.bio.model.Jurusan;
import java.util.List;
/**
 *
 * @author ASUS TUF GAMING
 */
public interface JurusanDAO {
    public boolean insert(Jurusan j);
    
    public boolean update(Jurusan j);
    
    public boolean delete(Jurusan j);
    
    public List<Jurusan> getAllJurusan();
    
    public Jurusan getByID (String id);
    
    public List<Jurusan> getByName(String name);
}
