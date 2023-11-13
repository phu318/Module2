package excercise.oop;

import java.util.Scanner;

public class Exercise {
    double width,height;
    public Exercise(){

    }
    public Exercise(double width, double height){//khai báo thuộc tính,định nghĩa phương thức
        this.height = height;
        this.width = width;
    }
    public double tinhDientich(){
        return width * height;
    }
    public double tinhChuvi(){
        return (width + height) * 2;
    }
    public String dispay(){
        return "Exercise{" + "width" + width + ", height=" + height +"}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// khai báo các biến lưu kích thước và gán giá trị
        System.out.println(" nhập chiều dài");
        double width = scanner.nextDouble();
        System.out.println(" nhập chiều rộng");
        double height = scanner.nextDouble();
        Exercise exercise = new Exercise(width,height);
        System.out.println("Your excercise \n" + exercise.dispay());
        System.out.println("Diện tích của hình chữ nhật là: " + exercise.tinhDientich());
        System.out.println("Chu vi của hình chữ nhật là: " + exercise.tinhChuvi());
    }
}

