import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Input Angka pertama : ");
        int angka1 = input.nextInt();

        System.out.println(" Input Angka kedua : ");
        int angka2 = input.nextInt();

        Penjumlahan hitungPenjmlhn = new Penjumlahan(angka1, angka2);
        hitungPenjmlhn.hitungPerhitungan();

        Pengurangan hitungPengrngn = new Pengurangan(angka1, angka2);
        hitungPengrngn.hitungPerhitungan();

        Perkalian hitungprklin = new Perkalian(angka1, angka2);
        hitungprklin.hitungPerhitungan();

        Pembagian hitungpembgian = new Pembagian(angka1, angka2);
        hitungpembgian.hitungPerhitungan();

    }
}