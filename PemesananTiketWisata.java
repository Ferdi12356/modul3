import java.util.Scanner;

public class PemesananTiketWisata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n====== selamat datang =====");
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan hari kunjungan (Senin, Selasa, dll): ");
        String hari = scanner.nextLine();

        System.out.print("Masukkan tanggal kunjungan (dd-mm-yyyy): ");
        String tanggal = scanner.nextLine();

        // Validasi data kosong
        if (nama.isEmpty() || hari.isEmpty() || tanggal.isEmpty()) {
            System.out.println("Data harus diisi!");
            return;
        }

        System.out.print("Jumlah pengunjung dewasa: ");
        int dewasa = scanner.nextInt();

        System.out.print("Jumlah pengunjung anak-anak: ");
        int anak = scanner.nextInt();

        System.out.print("Pilih jenis tiket (reguler/terusan): ");
        String jenisTiket = scanner.next();
        System.out.println("===========================\n");

        // Hitung harga tiket berdasarkan jenis tiket dan hari
        double hargaDewasa, hargaAnak, totalHarga = 0;
        boolean isWeekend = hari.equalsIgnoreCase("Sabtu") || hari.equalsIgnoreCase("Minggu");
        double kenaikanHarga = isWeekend ? 1.2 : 1;

        if (jenisTiket.equalsIgnoreCase("reguler")) {
            hargaDewasa = 75000 * kenaikanHarga;
            hargaAnak = 60000 * kenaikanHarga;
        } else if (jenisTiket.equalsIgnoreCase("terusan")) {
            hargaDewasa = 100000 * kenaikanHarga;
            hargaAnak = 85000 * kenaikanHarga;
        } else {
            System.out.println("Jenis tiket tidak valid!");
            return;
        }

        // Hitung total harga
        totalHarga = (dewasa * hargaDewasa) + (anak * hargaAnak);

        // Tampilkan hasil
        System.out.println("\n============= Rincian Pemesanan ===============");
        System.out.println("Nama: " + nama);
        System.out.println("Hari: " + hari);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Jenis Tiket: " + jenisTiket);
        System.out.println("Total Harga: Rp" + totalHarga);
        System.out.println("======== Terimakasih atas kunjungannya ========");
    }
}