import java.util.Scanner;

public class Tempatparkir02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jenis;
        int durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar) : ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam) : ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid! Coba lagi");
            }

        } while (jenis != 0);

        System.out.println("\nTotal parkir hari ini : Rp. " +total);
    }
    
}
