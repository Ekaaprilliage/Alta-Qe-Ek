public class Main {
    private static boolean palindrome(String value){
    int i = 0, j = value.length() -1;

    while(i < j){
        if (value.charAt(i) != value.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}