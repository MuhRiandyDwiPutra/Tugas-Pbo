package id.bio.model;

import id.bio.model.Mahasiswa;
import java.util.List;
/**
 *
 * @author ASUS TUF GAMING
 */
public class Mahasiswa {
    private String stambuk, nama;
    private Jurusan prodi;
    public Mahasiswa (String stambuk, String nama, Jurusan prodi) {
        this.stambuk = stambuk;
        this.nama = nama;
        this.prodi = prodi;
    }
    public Mahasiswa (String stambuk) {
        this.stambuk = stambuk;
    }
    
    public String getStambuk() {
        return stambuk;
    }

    
    public void setStambuk(String stambuk) {
        this.stambuk = stambuk;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the prodi
     */
    public Jurusan getProdi() {
        return prodi;
    }

    /**
     * @param prodi the prodi to set
     */
    public void setProdi(Jurusan prodi) {
        this.prodi = prodi;
    }
}
