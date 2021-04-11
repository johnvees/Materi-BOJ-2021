import java.io.*;

public class Mudah_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int angka1 = 0, angka2 = 0, angka3 = 0;

        System.out.print("Masukkan Panjang Sisi Pertama : ");
        angka1 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Panjang Sisi Kedua : ");
        angka2 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Panjang Sisi Ketiga : ");
        angka3 = Integer.parseInt(br.readLine());

        if (angka1 == angka2 && angka2 != angka3 && angka1 != angka3
                || angka2 == angka3 && angka2 != angka1 && angka1 != angka3
                || angka1 == angka3 && angka2 != angka1 && angka2 != angka3) {
            System.out.println("Hasil Inputan Anda adalah Segitiga Sama Kaki");
        } else if (angka1 == angka2 || angka1 == angka3 || angka2 == angka3) {
            System.out.println("Hasil Inputan Anda adalah Segitiga Sama Sisi");
        } else {
            System.out.println("Hasil Inputan Anda adalah Segitiga Sembarang");
        }

    }
}
