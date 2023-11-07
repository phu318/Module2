package org.example;

public class Baitap {
//    public static void main(String[] args) {
//int [] numbers = {13, 6, 2, 9, 7};
//        int max = numbers[0];
//        int max1 = numbers[1];
//        for(int i = 0;i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//                else if ( numbers[i] > max1 && numbers[i] != max ) {
//                        max1 = numbers[i];
//                    }
//        }
//        System.out.println("số lớn nhất trong mảng là: "  + max);
//        System.out.println("số lớn thứ 2 là: "  +  max1);
//    }
public static void main(String[] args) {
    int [] numbers = {13, 6, 2, 9, 7};
 int total = 0;
// int location = numbers
 for (int i = 0;i < numbers.length;i++){
     if (numbers[i] % 2 == 0){
         total += numbers[i];
     }
 }
    System.out.println("Tổng là :" + total);
    System.out.println("Vị trí số chẵn đầu tiên : " );
}
}
