package Kasir;

public class Barang {
    private String Barang ;
    private int Harga;
    private int Jumlah;

    public  Barang(String Barang, int Harga, int jumlah){
        this.Barang = Barang;
        this.Harga = Harga;
        this.Jumlah = jumlah;
    }

    public String getBarang() {
        return Barang;
    }

    public void setBarang(String barang) {
        Barang = barang;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int harga) {
        Harga = harga;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int jumlah) {
        Jumlah = jumlah;
    }
}
