import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NinjaFruit {
    public static void main(String[] args) {
        List<String> buah = Arrays.asList("apel", "pisang", "kiwi", "anggur", "semangka"); // mengganti {} ke <> mengikuti aturan dari Array;ist 
        //menggunakan asList dari krlas Arrays untuk membuat daftar daftar String secara langsung

        System.out.println("Total huruf: " + calculateTotalLength(buah));
        System.out.println("Kata terpanjang: " + findLongestWord(buah));
        System.out.println("Daftar kata dalam huruf kapital: " + capitalizeWords(buah));
        System.out.println("Panjang masing-masing kata: " + wordLengths(buah));
    }

    public static int calculateTotalLength(List<String> words) { // Menghitung jumlah huruf
        int totalLength = 0; //digunkan menampung jumlah total panjang semua kata
        for (String word : words) { //kata saat ini akan disimpan dalam var word
            totalLength += word.length(); // nilai totalLenght akan terus bertambah
        }
        return totalLength;
    }

    public static String findLongestWord(List<String> words) { // Menemukan kata terpanjang
        if (words.isEmpty()) { //daftar ini di periksa oleh isEmpty() apakah daftar words kosong
            throw new IllegalArgumentException("List kosong"); //jika words kosong, ilegalargumenex akan dilempar dengan pesan "Lisd kosong"
        }

        String longestWord = words.get(0); //titik awal untuk perbandingan
        for (String word : words) { //mengiterasi setiap kata dalam words
            if (word.length() > longestWord.length()) { //pangjang kata word.length dibandingkan dengan longetsWord
                longestWord = word; //jika kata saat ini lebih panjang, maka longestWord akan diperbarui
            }
        }
        return longestWord; //mengembalikan kata terpanjnag yang ditemukan
    }

    public static List<String> capitalizeWords(List<String> words) { // Mengubah setiap huruf menjadi kapital
        List<String> capitalizedWords = new ArrayList<>(); // daftar ini akan digunakan untuk menyimpan kata yang telah diubah menjadi huruf kapital
        for (String word : words) { //mengiterasi setiap kata dalam daftar words
            capitalizedWords.add(word.toUpperCase()); //toUpperCase mengubah semua huruf dalam word, kata yang sudah diuubah menjadi kapital ditmbah ke daftar capitallized
        }
        return capitalizedWords; //mengembalikan daftar capitalisez yang berisi kata kata dengan huruf kapital
    }

    public static List<Integer> wordLengths(List<String> words) { // Menghitung panjang kata
        List<Integer> lengths = new ArrayList<>(); //digunkan untuk menyimpan panjangan setiap kata
        for (String word : words) { //menginterasi
            lengths.add(word.length()); //lenght menghitung panjang kata word, kemudian panjang akan ditambkan ke daftar lenghts
        }
        return lengths; //mengembalikan daftar lengshts yang berisi panjang setiap kata
    }
}