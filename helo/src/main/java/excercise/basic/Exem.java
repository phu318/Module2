package excercise.basic;

 public class Exem {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Phần tử đã được tìm thấy.
            }

            if (arr[mid] < target) {
                left = mid + 1; // Dịch chuyển chỉ số bên trái của khoảng cần tìm kiếm.
            } else {
                right = mid - 1; // Dịch chuyển chỉ số bên phải của khoảng cần tìm kiếm.
            }
        }

        return -1; // Không tìm thấy phần tử trong danh sách.
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;
        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Phần tử " + target + " không tồn tại trong danh sách.");
        }
    }
}


