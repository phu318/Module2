package excercise.basic;

public class Exxx {
    public static void selectionSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;

        // Tìm phần tử nhỏ nhất trong danh sách còn lại
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        // Đổi chỗ phần tử nhỏ nhất với phần tử tại vị trí i
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr);
        System.out.println("Danh sách sau khi sắp xếp bằng Selection Sort:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
