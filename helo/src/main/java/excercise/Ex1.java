package excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {


    public static float getTotalElementGreaterThanBefore(float[] numbers) {
        float total = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                total += numbers[i + 1];
            }
        }
        return total;
    }

    public static float getTotalaverage(float[] numbers) {
        float total = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                total += numbers[i];
                count++;
            }
        }
        return (total) / count;
    }

    public static int[] moveNumbers(int[] numbers) {
        int[] sArr = new int[numbers.length];
        int nextpos = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                sArr[nextpos] = numbers[i];
                nextpos++;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 != 0) {
                sArr[nextpos] = numbers[i];
                nextpos++;
            }
        }

        return sArr;
    }

    public static int[] reverseNumbers(int[] numbers){
        int[] sArr = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            sArr[i] = numbers[numbers.length - 1 - i];
        }
        return sArr;
    }
    public static void reverseNumbers1(int[] numbers){

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length -1 - i];
            numbers[numbers.length -1 - i] = temp;
        }
    }
    public static void reverseNumbers3(int[] numbers){

        int left = 0;
        int right = numbers.length -1;
        while (left < right) {
            int temp = left;
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }

    public static void listedNumbers(int[] numbers){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
       int x = scanner.nextInt();
        System.out.println("nhap y");
        int y = scanner.nextInt();
        for (int i = x; i <= y; i++) {
            System.out.println(numbers[i]);
        }
    }
    public static void listedNumbers1(int[] numbers){
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > Math.abs(numbers[i - 1])) {
                System.out.println(numbers[i]);
            }
    }
    public static float[] listedNumbers2(float[] numbers, float x, float y){
        int count = 0;
        for (int i = 0; i < numbers.length;i++){
            if (numbers[i] >= x && numbers[i] <= y){
                count++;
            }
        }
        float[] a = new float[count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= x && numbers[i] <= y) {
                a[index] = numbers[i];
                index++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        /**
         //Bài 1: Tính tổng các giá trị lớn hơn giá trị đứng liền trước nó trong mảng 1 chiều các số thực
         int[] numbers = {8, 9, 2, 15, 15};
         listedNumbers2();
         //        moveNumbers(numbers);
         //        for (int i = 0; i < numbers.length ; i++) {
         //            System.out.println(moveNumbers(numbers));
         //        }
         //        for (int num : moveNumbers(numbers)) {
         //            System.out.print(num + " ");
         //        }
         //        getTotalaverage(numbers);
         //        System.out.println( getTotalaverage(numbers));
         //        getTotalElementGreaterThanBefore(numbers);
         //        System.out.println(getTotalElementGreaterThanBefore(numbers));
         //        reverseNumbers(numbers);
         //        for (int num : reverseNumbers(numbers)
         //             ) {
         //            System.out.println(num + " ");
         //        }
         //        listedNumbers(numbers);
         //        listedNumbers1(numbers);

         **/

        float [] arr = { 3.1f, 6.1f, 8.1f, 9.0f, 4.0f};

        for (float item: arr) {
            System.out.println(item);
        }
        System.out.println(Arrays.toString(listedNumbers2(arr, 4.0f, 8.0f)));
    }
}
