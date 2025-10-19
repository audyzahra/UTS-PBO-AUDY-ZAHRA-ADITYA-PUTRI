public class Pelanggan {
    private String idPelanggan;
    private String nama;

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
    }

    public void tampilInfo() {
        System.out.println(idPelanggan + " - " + nama);
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }
}
