import java.io.*;

public class Sedang_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=== Program untuk membuat pola sisi terluar segi empat atau persegi ===");

        int sisi;

        System.out.print("Masukkan Panjang Sisi: ");
        sisi = Integer.parseInt(br.readLine());

        if (sisi > 2) {
            for (int i = 0; i < sisi; i++) {
                for (int j = 0; j < sisi; j++) {
                    if ((i == 0) || (i == sisi - 1) || (j == 0) || (j == sisi - 1)) {
                        System.out.print("*");
                    } else {
                        if (sisi % 2 == 1) {
                            System.out.print(" ");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println("");
            }
        } else {
            System.err.print("Sisi tidak lebih dari 2");
        }
    }
}
