package excercise.basic;

public class Ex2 {
    public static void main(String[] args) {
        int[] numbers = {33, 2, 3, 4};
        int[] numbers1= {19, 5};
//        countPrime(numbers);
        System.out.println(countPrime(numbers));
//        System.out.println(countNumbers1(numbers));
//        determineNumbers(numbers);
//        checkNumbers(numbers);
//        System.out.println(checkNumbers(numbers));
//        System.out.println(checkNumbers1(numbers,numbers1));
//        System.out.println(checkAscending(numbers));
    }


    public static boolean checkNumbers1(int[] numbers,int[] numbers1){
       for (int i = 0; i < numbers.length; i++) {
           boolean check = false;
           for (int j = 0; j < numbers1.length; j++) {
               if (numbers[i] == numbers1[j]){
                   return true;
               }

               }
           if (!check){
               return false;
           }
       }
       return true;
   }

    public static boolean checkAscending(int[] numbers){
        if (numbers.length < 2){
            return false;
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static int countNumbers(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 7 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean countNumbers1(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int countPrime(int[] numbers){
        int count = 0;
//        countNumbers(numbers);
//        System.out.println( countNumbers(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (countNumbers1(numbers[i])) {
                count++;
            }
        }
        return count;
    }
    public static int determineNumbers(int[] numbers){
        int count = 0;
        for (int i = 0; i < numbers.length -1; i++) {
            if (numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0 || numbers[i - 1] % 2 == 0){
                count++;
            }
        }
        return  count;
    }

    public static boolean checkNumbers(int[] numbers){
        if (numbers.length < 2){
            return false;
        }
        for (int i = 0; i <= numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
