import java.io.*;

public class Mudah_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=== Program untuk menukar value dari 2 variable berbeda ===");
        System.out.println("");

        int val1, val2, temp = 0;

        System.out.print("Masukkan Value Variable pertama: ");
        val1 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Value Variable kedua: ");
        val2 = Integer.parseInt(br.readLine());

        temp = val1;
        val1 = val2;
        val2 = temp;

        System.out.println("=== Hasil ===");
        System.out.println("Variable pertama menjadi: " + val1);
        System.out.println("Variable kedua menjadi: " + val2);

    }
}
