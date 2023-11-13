package excercise.oop;

import java.util.Scanner;

public class Excercise1 {
double a, b, c;
public Excercise1(double a, double b, double c){//khai báo thuộc tính
    this.a = a;
    this.b = b;
    this.c = c;
}
public double timDelta(){
    return b * b - 4 * a * c;
}
public double timNghiem1(){
    return ( -b + Math.sqrt(b * b - 4 * a *c) / (2*a));
}
public double timNghiem2(){
    return (-b - Math.sqrt(b * b - 4 * a * c) / (2*a));
}

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public void giaiPT(){
    double delta1 = this.timDelta();
        System.out.println("Delta là :" +delta1);
        if (delta1 > 0){
            System.out.println("nghiem 1 là: " +this.timNghiem1());
            System.out.println("nghiem 2 là: " + this.timNghiem2());
        } else if (delta1 == 0) {
            System.out.println("nghiem của Pt là:" + this.timNghiem1());
        }
        else System.out.println("PT vô nghiệm");
    }// giải phương trình

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("nhập c: ");
        double c = scanner.nextDouble();
        Excercise1 excercise1= new Excercise1(a, b, c);
        excercise1.giaiPT();
    }// thực hiện in phương trình
}
