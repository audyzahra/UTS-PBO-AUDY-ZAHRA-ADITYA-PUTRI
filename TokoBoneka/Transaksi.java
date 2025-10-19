public class Transaksi {
    private String idTransaksi;
    private Pelanggan pelanggan;
    private Boneka boneka;
    private int jumlah;
    private double totalHarga;

    public Transaksi(String idTransaksi, Pelanggan pelanggan, Boneka boneka, int jumlah) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.boneka = boneka;
        this.jumlah = jumlah;
        this.totalHarga = boneka.getHarga() * jumlah;
        boneka.kurangiStok(jumlah);
    }

    public void tampilTransaksi() {
        System.out.println(idTransaksi + " | " + pelanggan.getIdPelanggan() +
                " | " + jumlah + "x " + boneka.getHarga() +
                " | Total: Rp" + totalHarga);
    }

    public double hitungTotal() {
        return totalHarga;
    }
}
