public class Boneka {
    private String idBoneka;
    private String nama;
    private String jenis;
    private double harga;
    private int stok;

    public Boneka(String idBoneka, String nama, String jenis, double harga, int stok) {
        this.idBoneka = idBoneka;
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilInfo() {
        System.out.println(idBoneka + " | " + nama + " | " + jenis + " | Rp" + harga + " | Stok: " + stok);
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jml) {
        stok -= jml;
    }
}
