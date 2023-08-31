import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bill = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input = ");
        bill = input.nextInt();
        System.out.println("Output = ");
        for (int i = 1; i<=bill; i++){
            if (bill % i == 0){
                System.out.println(i+"");
            }
        }
    }
}