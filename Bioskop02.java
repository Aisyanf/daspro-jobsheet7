import java.util.Scanner;

public class Bioskop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        double diskon = 0;

        System.out.print("Masukkan jumlah tiket yang dibeli : ");
        totalTiketTerjual = sc.nextInt();
        
        while (totalTiketTerjual < 0) {
            System.out.println("Jumlah tiket tidak boleh negatif! Coba lagi.");
            System.out.print("Masukkan jumlah tiket yang dibeli : ");
            totalTiketTerjual = sc.nextInt();
        }

        if (totalTiketTerjual > 10) {
            diskon = 0.15;
        } else if (totalTiketTerjual > 4) {
            diskon = 0.10;
        }

        totalPenjualan = totalTiketTerjual * hargaTiket * (1 - diskon);

        System.out.println("Diskon : " + (diskon * 100) + "%");
        System.out.println("Total bayar : Rp. " + (int) totalPenjualan);

    }
}
