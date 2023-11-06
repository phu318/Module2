package org.example;
import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        for (int i = 0; i < 10 ; i++){
                System.out.println("Menu:");
                System.out.println("1. Bia");
                System.out.println("2. Heo");
                System.out.println("3. Bò");
                System.out.println("4. Bạn đã kết thúc chọn món");
                System.out.println("Cho người dùng chọn:");
                choice = scanner.nextInt();
                switch (choice) {
                case 1:
                    System.out.println("Bạn đang chọn Bia");
                    break;
                case 2:
                    System.out.println("Bạn đang chọn Heo");
                    break;
                case 3:
                    System.out.println("Bạn đang chọn Bò");
                    break;
                    case 4:
                        System.out.println("Chương trình đã kết thúc");
                        i = 10;
                        break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
                }
            }
}

