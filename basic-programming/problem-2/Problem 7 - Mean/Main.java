public class Main {
    private static float Mean(float[] numbers){
        float sum = 0;
        for (float num : numbers){
            sum += num;
        }
        return sum / numbers.length;
    }
    public static void main(String[] args) {
    float[] value = {1, 2, 3, 4};
    System.out.println(Mean(value));
    }
}