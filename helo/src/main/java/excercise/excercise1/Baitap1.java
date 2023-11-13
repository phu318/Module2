package excercise.excercise1;

public class Baitap1 {
    public static void main(String[] args) {
        /*
        demcacSole(6);
        System.out.println(demcacSole(6));

        System.out.println( lietkeSole(arr));
        String s = "1235";
        String [] items = s.split("");     // ["1", "2", "3", "5"]
        int n = Integer.parseInt("5");      // từ chuỗi về số
        */

        int[] arr = {1,235,31,5,6,824,23};
        allEven(arr);
    }
    public static boolean demcacSole(int number){
        if (number < 0){
            return false;
        }
        for (int i = 0; i < number; i++) {
            if (number % 2 == 0){
                return false;
            }
        }
        return true;
    }
    public static int lietkeSole(int[] numbers){
        int count = 0;
//        demcacSole(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (demcacSole(numbers[i])){
                count++;
            }

        }
        return count;
    }

    public static void allEven(int [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            String item = numbers[i] + "";      // "235"
            String [] items = item.split("");
            boolean flag = true;
            for(int j=0;j<items.length;j++){
                if(Integer.parseInt(items[j]) % 2 == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(numbers[i]);
            }
        }
    }
    public static boolean countNumbers1(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void allEven1(int[] numbers){
        boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
            if (countNumbers1(numbers[i])){

            }
        }
    }

    public static void  listNumbers(int[] numbers){
        int index = 0;
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] % i == 0){
                
                System.out.println();
            }
        }
    }
}
