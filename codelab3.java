public class codelab3 {
    public int perhitunganGaji(int jamKerja, int gajiperjam) {
        int gajiTotal = 0;
        for (int i = 0; i < jamKerja; i++) {
            gajiTotal += gajiperjam;
        }
        return gajiTotal;
    }

    public static void main(String[] args) {
        codelab3 hitung = new codelab3();
        int gajiTotal = hitung.perhitunganGaji(40, 250000);
        System.out.println("Gaji karyawan dengan 40 jam kerja = " + gajiTotal);
    }
}