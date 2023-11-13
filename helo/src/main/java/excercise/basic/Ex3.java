package excercise.basic;

public class Ex3 {
    public static void main(String[] args) {
float[] numbers = {0.5f, 1.2f, 2.7f, 0.3f};
        totalFloat(numbers);
        System.out.println( totalFloat(numbers));
    }
    public static float totalFloat (float[] numbers){
        float total = 0.0f;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]){
                total += numbers[i + 1];
            }
        }
        return total;
    }


}
