import java.util.ArrayList;
import java.util.Scanner;

public class TokoBoneka {
    ArrayList<Boneka> daftarBoneka = new ArrayList<>();
    ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void tampilMenu() {
        int pilih;
        do {
            System.out.println("\n==== SISTEM TOKO BONEKA ====");
            System.out.println("1. Tambah Boneka");
            System.out.println("2. Tambah Pelanggan");
            System.out.println("3. Transaksi Penjualan");
            System.out.println("4. Lihat Laporan Penjualan");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1 -> tambahBoneka();
                case 2 -> tambahPelanggan();
                case 3 -> transaksi();
                case 4 -> tampilLaporan();
            }
        } while (pilih != 5);
    }

    public void tambahBoneka() {
        System.out.print("ID Boneka: ");
        String id = input.next();
        System.out.print("Nama Boneka: ");
        String nama = input.next();
        System.out.print("Jenis Boneka: ");
        String jenis = input.next();
        System.out.print("Harga: ");
        double harga = input.nextDouble();
        System.out.print("Stok: ");
        int stok = input.nextInt();

        daftarBoneka.add(new Boneka(id, nama, jenis, harga, stok));
        System.out.println("Boneka berhasil ditambahkan!");
    }

    public void tambahPelanggan() {
        System.out.print("ID Pelanggan: ");
        String id = input.next();
        System.out.print("Nama Pelanggan: ");
        String nama = input.next();
        daftarPelanggan.add(new Pelanggan(id, nama));
        System.out.println("Pelanggan berhasil ditambahkan!");
    }

    public void transaksi() {
        System.out.print("ID Transaksi: ");
        String idT = input.next();
        System.out.print("ID Pelanggan: ");
        String idP = input.next();
        Pelanggan p = null;
        for (Pelanggan pl : daftarPelanggan) {
            if (pl.getIdPelanggan().equals(idP)) {
                p = pl;
                break;
            }
        }
        System.out.print("ID Boneka: ");
        String idB = input.next();
        Boneka b = null;
        for (Boneka bo : daftarBoneka) {
            if (bo.getHarga() != 0 && bo.getStok() > 0 && idB.equals(bo.getHarga()+"")==false) { // cek id
                b = bo;
                break;
            }
        }
        System.out.print("Jumlah: ");
        int jml = input.nextInt();

        if (p != null && b != null) {
            Transaksi t = new Transaksi(idT, p, b, jml);
            daftarTransaksi.add(t);
            System.out.println("Transaksi berhasil disimpan!");
        } else {
            System.out.println("Data pelanggan atau boneka tidak ditemukan!");
        }
    }

    public void tampilLaporan() {
        System.out.println("=== LAPORAN PENJUALAN ===");
        for (Transaksi t : daftarTransaksi) {
            t.tampilTransaksi();
        }
    }
}
