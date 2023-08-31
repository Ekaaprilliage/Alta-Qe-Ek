import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Input Sisi Persegi : ");
        int sisiPersegi = input.nextInt();

        Persegi luasPersegi = new Persegi(sisiPersegi);
        luasPersegi.hitungLuasPersegi();
        System.out.println(" Luas Persegi : " + luasPersegi.hitungLuasPersegi());

        Persegi kelilingPersegi = new Persegi(sisiPersegi);
        kelilingPersegi.hitungKelilingPersegi();
        System.out.println(" Keliling Persegi " + kelilingPersegi.hitungKelilingPersegi());

        System.out.println(">>>>>>><<<<<<<<<<<");

        System.out.println(" Input Alas Segitiga : ");
        int alas = input.nextInt();

        System.out.println(" Input tinggi Segitiga : ");
        int tinggi = input.nextInt();

        System.out.println(" Input Sisi A Segitiga : ");
        int sisiA = input.nextInt();

        System.out.println(" Input Sisi B Segitiga : ");
        int sisiB = input.nextInt();

        System.out.println(" Input Sisi C Segitiga : ");
        int sisiC = input.nextInt();

        Segitiga luasSegitiga = new Segitiga(alas,tinggi);
        luasSegitiga.hitungLuasSegitiga();
        System.out.println(" Luas Segitiga : " + luasSegitiga.hitungLuasSegitiga());

        Segitiga kelilingSegitiga = new Segitiga(sisiA, sisiB, sisiC);
        kelilingSegitiga.hitungKelilingSegitiga();
        System.out.println(" Keliling Segitiga : " + kelilingSegitiga.hitungKelilingSegitiga());

        System.out.println(">..........................................<");

        System.out.println(" Input Panjang : ");
        int panjang = input.nextInt();

        System.out.println(" Input Lebar : ");
        int lebar = input.nextInt();

        PersegiPanjang luasPersegiPanjang = new PersegiPanjang(panjang, lebar);
        luasPersegiPanjang.hitungPersegiPanjang();
        System.out.println(" Luas Persegi Panjang : " + luasPersegiPanjang.hitungPersegiPanjang());

        PersegiPanjang kelilingPersegiPanjang = new PersegiPanjang(panjang, lebar);
        kelilingPersegiPanjang.hitungKelilingPersegiPanjang();
        System.out.println(" Keliling Persegi Panjang : " + kelilingPersegiPanjang.hitungKelilingPersegiPanjang());

    }

}