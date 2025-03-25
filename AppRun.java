package CB03;
public class AppRun {
    public static void main(String[] args) {
        Buku buku1 = new Buku ("100 Resep Masakan Nusantara", "Sisca Soewitomo",
        2015, "Tersedia");
        Buku buku2 = new Buku ("Resep Masakan Sederhana & Praktis untuk Sehari-hari",
        "Alma", 2018, "Tersedia");
        Buku buku3 = new Buku ("Panduan Lengkap Kue Tradisional Indonesia", "Yasa Boga",
        2014, "Tersedia");
        Buku buku4 = new Buku ("Rahasia Masakan Padang", "Fajar Okta",
        2020, "Tersedia");
        Buku buku5 = new Buku ("30 Menu Masakan Rumahan Favorit", "Desi Anwar",
        2019, "Tersedia");
        
        Anggota anggota1 = new Anggota ("Siti Rahma", 100001);
        Anggota anggota2 = new Anggota ("Budi Santoso", 100002);
        Anggota anggota3 = new Anggota ("Andi Pratama", 100003);
        Anggota anggota4 = new Anggota ("Fitri Handayani", 100004);
        Anggota anggota5 = new Anggota ("Rudi Hartono", 100005);
        
        Perpustakaan perpus = new Perpustakaan();
        perpus.tambahBuku(buku1);
        perpus.tambahBuku(buku2);
        perpus.tambahBuku(buku3);
        perpus.tambahBuku(buku4);
        perpus.tambahBuku(buku5);

        perpus.tambahAnggota(anggota1);
        perpus.tambahAnggota(anggota2);
        perpus.tambahAnggota(anggota3);
        perpus.tambahAnggota(anggota4);
        perpus.tambahAnggota(anggota5);

        try{
            perpus.pinjamBuku(100001, "Rahasia Masakan Padang");
            perpus.kembaliBuku(100001, "30 Menu Masakan Rumahan Favorit");
        }catch(Exception x){
            System.out.printf("%s%n",x.getMessage());
        }

    
    }
}
