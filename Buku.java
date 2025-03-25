package CB03;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String status;
    private String namaPeminjam;

    public Buku (String judul, String penulis, int tahunTerbit, String status){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.status = status;
    }

    public String getJudul(){
        return judul;
    }
    public String getPenulis(){
        return penulis;
    }
    public int getTahunTerbit(){
        return tahunTerbit;
    }
    public String getStatus(){
        return status;
    }
    
    public void pinjamBuku(String namaPeminjam, String status) throws BukuTidakTersediaException{
        if(this.status.equalsIgnoreCase("Tidak tersedia")){
            throw new BukuTidakTersediaException("Buku \"" + judul + "\" sedang dipinjam.");
        }
        this.status = status;
        this.namaPeminjam = namaPeminjam;
    }

    public void kembaliBuku(String status) throws BukuTidakDipinjamException{
        if(this.status.equalsIgnoreCase("Tersedia")) {
            throw new BukuTidakDipinjamException("Buku \"" + judul + "\" tidak sedang dipinjam.");
        }
        this.status = status;
    }

    public void displayMessage(){
        System.out.printf("Judul \t\t: %s%n",judul);
        System.out.printf("Penulis \t: %s%n",penulis);
        System.out.printf("Tahun terbit \t: %d%n",tahunTerbit);
        System.out.printf("Status \t\t: %s%n",status);
        System.out.printf("Nama Peminjam \t: %s%n",namaPeminjam);
    }
}
