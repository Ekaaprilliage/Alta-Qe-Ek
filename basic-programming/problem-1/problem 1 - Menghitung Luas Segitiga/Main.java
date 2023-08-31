import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //float alas = 20;
        //float tinggi = 25;

        //double luas = (0.5*(alas*tinggi));
        //System.out.println("hasil keliling = "+luas);

        Scanner input = new Scanner(System.in);
        int alas, tinggi;
        double luas;
        System.out.println("Input Nilai Alas : ");
        alas = input.nextInt();
        System.out.println("Input Nilai Tinggi : ");
        tinggi = input.nextInt();

        luas =0.5*alas*tinggi;
        System.out.println("Hasil Luas Segitiga: " +luas);
    }
}