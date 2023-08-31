import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Masukan Volume Kubus : ");
        int SisiKubus = input.nextInt();

        Kubus VolumeKubus = new Kubus(SisiKubus);
        VolumeKubus.hitungVolumeKubus();
        System.out.println(" Volume Kubus : " + VolumeKubus.hitungVolumeKubus());

        System.out.println("__------_______------__ ");

        System.out.println(" Input Panjang Balok : ");
        int panjang = input.nextInt();

        System.out.println(" Input Lebar Balok : ");
        int lebar = input.nextInt();

        System.out.println(" Input Tinggi Balok : ");
        int tinggi = input.nextInt();

        Balok VolumeBalok = new Balok(panjang, lebar, tinggi);
        VolumeBalok.hitungVolumeBalok();
        System.out.println(" Volume Kubus : "+ VolumeBalok.hitungVolumeBalok());

        System.out.println("__------_______------__ ");

        System.out.println(" Input Jari - Jari Tabung : ");
        int jari2 = input.nextInt();

        System.out.println(" Input Tinggi Tabung : ");
        int Tinggi = input.nextInt();

        Tabung VolumeTabung = new Tabung(jari2, Tinggi);
        VolumeTabung.hitungVolumeTabung();
        System.out.println(" Volume Tabung : "+ VolumeTabung.hitungVolumeTabung());
    }
}