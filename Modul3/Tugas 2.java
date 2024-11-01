import java.util.Scanner;

/**
 * Kelas Kalkulator adalah program sederhana untuk melakukan operasi aritmatika dasar
 * seperti penjumlahan, pengurangan, perkalian, dan pembagian.
 * Program ini meminta input dari pengguna berupa dua bilangan dan satu operator aritmatika.
 */
public class Kalkulator {

    /**
     * Metode utama untuk menjalankan program kalkulator.
     * Program ini menerima input pengguna untuk dua bilangan dan satu operator, kemudian
     * menampilkan hasil operasi aritmatika yang sesuai.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int operand1 = scanner.nextInt();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        int operand2 = scanner.nextInt();

        int result;

        /**
         * Menentukan operasi aritmatika berdasarkan input operator.
         * Operator yang didukung adalah:
         * '+' untuk penjumlahan,
         * '-' untuk pengurangan,
         * '*' untuk perkalian,
         * '/' untuk pembagian.
         */
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }

        // Menampilkan hasil operasi aritmatika kepada pengguna
        System.out.println("Hasil: " + result);
    }
}
