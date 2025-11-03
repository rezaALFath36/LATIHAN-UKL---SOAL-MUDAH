# LATIHAN-UKL---SOAL-MUDAH
import java.util.Scanner;
public class SoalMudah {
    public static void main(String[] args) {
        double panjang, lebar, tinggi, volume, jarak, berat, TotalBiaya;
        double biaya = 0;
        double tarif = 0;
        // SOAL 1
        // MENCARI VOLUME PAKET
        Scanner input = new Scanner(System.in);
        System.out.println("MENGHITUNG VOLUME PAKET");
        System.out.print("Masukkan panjang paket(cm): ");
        panjang = input.nextDouble();

        System.out.print("Masukkan lebar pengiriman(cm) :");
        lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket(cm) :");
        tinggi = input.nextDouble();

        volume = panjang * lebar * tinggi;
        System.out.println("Volume paket: " + volume + " cm^3");

        if (volume >= 100) {
            tarif += 50000;
            System.out.println("paket anda melebihi batas volume dan mendapatkan biaya tambahan sebesar Rp 50000");
        } else {
            tarif += 0;
        }
        
    // MENGETAHUI BIAYA PENGIRIMAN PAKET
        System.out.println("\n MENGHITUNG BIAYA PENGIRIMAN PAKET");
        System.out.print("Masukkan jarak pengiriman(km): ");
        jarak = input.nextDouble();
        System.out.println("jarak pengiriman adalah: " + jarak + " km");

        System.out.print("\nMasukkan berat paket(kg): ");
        berat = input.nextDouble();
        System.out.println("berat paket adalah: " + berat + " kg");

        if (jarak >= 10) {
            biaya += 6000 * berat;
        } else {
            biaya += 4250 * berat;
        }

        TotalBiaya = biaya + tarif;
        System.out.println("\n TOTAL BIAYA PENGIRIMAN PAKET: Rp " + TotalBiaya);
        input.close();
    
    }
}

import java.util.Scanner;
public class SoalMudah2 {
    public static void main(String[] args) {
        //SOAL 2
        //GANJL ATAU GENAP
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();



        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");

        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
        scanner.close();
    }

}
