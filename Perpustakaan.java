package CB03;
import java.util.*;
public class Perpustakaan {
    private List<Buku> daftarBuku;
    private HashMap<Long, Anggota> daftarAnggota;

    public Perpustakaan(){
        daftarBuku = new ArrayList<>();
        daftarAnggota = new HashMap<>();
    }

    public void tambahBuku(Buku buku){
        daftarBuku.add(buku);
    }
    public void tambahAnggota(Anggota anggota){
        daftarAnggota.put(anggota.getIdAnggota(), anggota);
    }
    public void pinjamBuku(long idAnggota, String judul) throws Exception {
        if (!daftarAnggota.containsKey(idAnggota)) {
            throw new AnggotaTidakDitemukanException("Anggota dengan ID " + idAnggota + " tidak ditemukan.");
        }

        Anggota anggota = daftarAnggota.get(idAnggota);
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.pinjamBuku(anggota.getNama(),"Tidak tersedia");
                anggota.pinjamBuku(buku);
                System.out.println("Buku berhasil dipinjam!");
                return;
            }
        }

        throw new BukuTidakTersediaException("Buku dengan judul \"" + judul + "\" tidak ditemukan.");
    }

    public void kembaliBuku(long idAnggota, String judul) throws Exception {
        if (!daftarAnggota.containsKey(idAnggota)) {
            throw new AnggotaTidakDitemukanException("Anggota dengan ID " + idAnggota + " tidak ditemukan.");
        }

        Anggota anggota = daftarAnggota.get(idAnggota);
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.kembaliBuku("Tersedia");
                anggota.kembaliBuku(buku);
                System.out.println("Buku berhasil dikembalikan!");
                return;
            }
        }

        throw new BukuTidakTersediaException("Buku dengan judul \"" + judul + "\" tidak ditemukan.");
    }
}
