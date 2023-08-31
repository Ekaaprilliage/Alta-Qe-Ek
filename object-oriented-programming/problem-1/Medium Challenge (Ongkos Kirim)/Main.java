import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Input Panjang : ");
        int panjang = input.nextInt();

        System.out.println(" Input Lebar : ");
        int lebar = input.nextInt();

        System.out.println(" Input Tinggi : ");
        int tinggi = input.nextInt();

        System.out.println(" Input Berat : ");
        int Berat = input.nextInt();

        VolumeBarang hitungHarga = new VolumeBarang(panjang, lebar, tinggi, Berat);
        hitungHarga.hitungHargaBarang();


    }
}