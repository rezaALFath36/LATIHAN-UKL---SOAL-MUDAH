import java.util.Scanner;
public class SoalMudah2 {
    public static void main(String[] args) {

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
