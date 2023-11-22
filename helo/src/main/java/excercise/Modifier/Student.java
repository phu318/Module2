package excercise.Modifier;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    // hàm khởi tạo biến
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    //phương thức tĩnh để thay đổi giá trị của biến tĩnh
    static void  change(){
        college = "Codegym";
    }
    // phương thức hiển thị giá trị
    void  display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
