package excercise.basic;

public class LinearSearchExample {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Trả về vị trí của giá trị cần tìm kiếm nếu tìm thấy
            }
        }
        return -1;  // Trả về -1 nếu không tìm thấy giá trị cần tìm kiếm
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 12, 15, 18, 22, 25, 30};
        int target = 15;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Giá trị " + target + " không tồn tại trong danh sách.");
        }
    }
}

