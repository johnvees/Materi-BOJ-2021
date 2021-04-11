import java.io.*;

public class Sedang_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=== Program untuk menghitung perkalian 2 matriks berordo 3x3 ===");
        System.out.println("");
        int barisMatriks1, barisMatriks2, kolomMatriks1, kolomMatriks2, jumlah = 0;
        int matriks1[][] = new int[3][3];
        int matriks2[][] = new int[3][3];
        int hasil[][] = new int[3][3];

        System.out.print("Masukkan jumlah baris matriks pertama: ");// tentunya 3
        barisMatriks1 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan jumlah kolom matriks pertama: ");// tentunya 3
        kolomMatriks1 = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah baris matriks kedua: ");// tentunya 3
        barisMatriks2 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan jumlah kolom matriks kedua: ");// tentunya 3
        kolomMatriks2 = Integer.parseInt(br.readLine());

        System.out.println("");

        if (kolomMatriks1 != barisMatriks2) {
            System.out.println("Matriks pertama dan kedua tidak dapat dikalikan");
        } else {
            System.out.println("Masukkan angka-angka pada matriks pertama");
            for (int i = 0; i < barisMatriks1; i++) {
                for (int j = 0; j < kolomMatriks1; j++) {
                    matriks1[i][j] = Integer.parseInt(br.readLine());
                }
                System.out.println("");
            }

            System.out.println("Masukkan angka-angka pada matriks kedua");
            for (int i = 0; i < barisMatriks2; i++) {
                for (int j = 0; j < kolomMatriks2; j++) {
                    matriks2[i][j] = Integer.parseInt(br.readLine());
                }
                System.out.println("");
            }

            for (int i = 0; i < barisMatriks1; i++) {
                for (int j = 0; j < kolomMatriks2; j++) {
                    for (int k = 0; k < barisMatriks1; k++) {
                        jumlah = jumlah + matriks1[i][k] * matriks2[k][j];
                    }
                    hasil[i][j] = jumlah;
                    jumlah = 0;
                }
            }

            System.out.println("=== Hasil Perkalian Dua Matriks ===");
            for (int i = 0; i < barisMatriks1; i++) {
                for (int j = 0; j < kolomMatriks2; j++) {
                    System.out.print(hasil[i][j] + "\t");
                }
                System.out.println("");
            }
        }
    }
}
