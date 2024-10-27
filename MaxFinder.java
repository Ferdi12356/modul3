public class MaxFinder {

    // Fungsi untuk menemukan nilai maksimum dari tiga bilangan bulat
    public static int findMax(int num1, int num2, int num3) {
        // Menggunakan Math.max untuk menemukan nilai terbesar
        int max = Math.max(num1, num2);  // Bandingkan dua bilangan pertama
        max = Math.max(max, num3);       // Bandingkan hasilnya dengan bilangan ketiga
        return max;
    }

    public static void main(String[] args) {
        // Contoh penggunaan fungsi findMax
        int a = 1, b = 3, c = 2;
        System.out.println("Nilai maksimum dari " + a + ", " + b + ", dan " + c + " adalah: " + findMax(a, b, c));
    }
}