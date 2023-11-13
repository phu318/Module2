package excercise.excercise1;

public class Vidu {
    public static void main(String[] args) {
//        int number = 42;
//                // Định dạng số nguyên thành chuỗi
//                String formattedString = String.format("%d", number);
//                System.out.println("Số nguyên đã định dạng: " + formattedString);
        int number = 1234567;

// Định dạng số nguyên với dấu phẩy ngăn cách hàng nghìn
        String formattedString = String.format("%,d", number);
        System.out.println("Số nguyên đã định dạng: " + formattedString);

// Định dạng số nguyên với 2 chữ số thập phân
        double floatingNumber = 12345.6789;
        String formattedFloat = String.format("%.2f", floatingNumber);
        System.out.println("Số thập phân đã định dạng: " + formattedFloat);

    }
        }

