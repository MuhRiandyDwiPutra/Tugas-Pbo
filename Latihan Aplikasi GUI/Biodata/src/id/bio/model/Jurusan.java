package id.bio.model;

/**
 *
 * @author ASUS TUF GAMING
 */
public class Jurusan {
    private String id;
    private String nama;
    public Jurusan (String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
    @Override
    public String toString() {
        return "Jurusan{" + "id=" + id + ", nama=" + nama + '}';
    }
}
