import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Nilai huruf A = 80 - 100
        //Nilai huruf B+ = 65 - 79
        //Nilai huruf B = 50 - 64
        //Nilai huruf C = 35 - 49
        //Nilai huruf D = 0 -34
        Scanner input = new Scanner(System.in);
        System.out.println("Input Nilai");
        int angka = input.nextInt();
        String nilai = "";


        if (angka >=80 && angka <=100){
            nilai = "Nilai A";
        } else if (angka >= 65 && angka <=79){
            nilai = "Nilai B+";
        } else if (angka >=50 && angka <=64){
            nilai = "Nilai B";
        } else if (angka >=35 && angka<=49){
            nilai = "Nilai C";
        } else if (angka >=1 && angka<=34){
            nilai = "Nilai D";
        } else {
            nilai = "Invalid";
        }
        System.out.println("Nilai " + nilai);
    }
}