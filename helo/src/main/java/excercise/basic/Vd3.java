package excercise.basic;

import java.lang.*;
import java.util.*;

public class Vd3 {
    public static void main(String[] args) {
//        String str = "Nguyen Huu Hiep";
//        String str01 = "Nguyen";
//        System.out.println(str.indexOf("uu", 9));
		/* Split: Phân tách 1 chuỗi thành một mảng

        split(String regex)
        split(String regex, int limit)
String str = "Nguyen Huu Hiep";
        String[] strArr01 = str.split(" ");
        String[] strArr = str.split(" ",2);
        System.out.println(Arrays.toString(strArr));

        ------------------------------------------
        CharAt: trả về 1 kí tự tại vị trí index.
String str = "Nguyen Huu Hiep";
        char s = str.charAt(str.length() -1);
        System.out.println(s);

        ------------------------------------------
        length(): Lấy độ dài của 1 chuỗi
        int lenStr = str.length();
        System.out.println(lenStr);
        ------------------------------------------
        equals(): So sánh 2 chuỗi có giống nhau không? và trả về kiểu giá trị boolean

String str = "Nguyen Huu Hiep";
        String str01 = "Nguyen Huu hiep";
        System.out.println(str.equals(str01));
        ------------------------------------------
        contains(CharSequence s): Xem xét hoặc tìm kiếm chuỗi s có nằm trong một chuỗi không?
        Trả về giá trị boolean


        ------------------------------------------
        indexOf(int ch): Trả về vị trí của giá trị kí tự hoặc chuỗi con
        int indexOf(int ch) //Trả về vị trị của giá trị Char đã cho.
        int indexOf(int ch, int fromIndex) //Trả về vị trị của giá trị Char đã cho tính từ vị trí fromIndex.
        int indexOf(String substring) //Trả về vị trị của chuỗi con.
        int indexOf(String substring, int fromIndex) //Trả về vị trị của chuỗi con đã cho tính từ vị trí fromIndex.
        Nếu không tìm thấy trả lại giá trị -1. Chỉ số (index) được đếm từ 0.


        ------------------------------------------
        toLowerCase() && toUpperCase(): chuyển chuỗi về dạng chũ thường hoặc chữ hoa
        ------------------------------------------
        trim(): được dùng để xóa kí tự trắng ở đầu hoặc cuối của chuỗi
        ------------------------------------------
        valueOf(): được dùng để chuyển đổi kiểu dữ liệu khác thành chuỗi.
        ------------------------------------------
        subString(): trả về chuỗi con của một chuỗi
        public String substring(int startIndex)
        public String substring(int startIndex, int endIndex)
        */
        String str = "Nguyen Huu Hiep";
        System.out.println(str.substring(7));


    }


}

