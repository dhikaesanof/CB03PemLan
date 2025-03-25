package CB03;
import java.util.*;
public class Anggota {
    private String nama;
    private long idAnggota;
    private List<Buku> daftarBukuDipinjam;

    public Anggota (String nama, long idAnggota){
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.daftarBukuDipinjam = new ArrayList<>();
    }
    public String getNama(){
        return nama;
    }
    public long getIdAnggota(){
        return idAnggota;
    }
    public void pinjamBuku(Buku buku){
        daftarBukuDipinjam.add(buku);
    }
    public void kembaliBuku(Buku buku){
        daftarBukuDipinjam.remove(buku);
    }
    
}
