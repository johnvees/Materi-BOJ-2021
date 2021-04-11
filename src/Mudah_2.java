import java.io.*;

public class Mudah_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=== Program Untuk Menentukan Bilangan Terbesar, Terkecil, dan Rata-rata ===");
        System.out.println("");

        System.out.print("Masukkan banyak bilangan yang akan diinput: ");
        int banyakBilangan = Integer.parseInt(br.readLine());
        int angka[] = new int[banyakBilangan];
        int terkecil, terbesar;
        double finalAverage, average = 0;

        for (int i = 0; i < banyakBilangan; i++) {
            System.out.print("Masukkan Bilangan ke-" + i + " : ");
            angka[i] = Integer.parseInt(br.readLine());
        }

        terkecil = angka[0];
        terbesar = angka[0];

        for (int i = 0; i < banyakBilangan; i++) {
            if (angka[i] < terkecil) {
                terkecil = angka[i];
            } else if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }

        for (int i = 0; i < banyakBilangan; i++) {
            average = average + angka[i];
        }

        finalAverage = average / banyakBilangan;
        System.out.println("");
        System.out.println("=== Hasil Perhitungan ===");
        System.out.println("Bilangan Terkecil: " + terkecil);
        System.out.println("Bilangan Terbesar: " + terbesar);
        System.out.println("Hasil Rata-Rata dari ke-" + banyakBilangan + " bilangan adalah: " + finalAverage);
    }
}
