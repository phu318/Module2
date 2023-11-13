package excercise.basic;

 public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key xuống một vị trí
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        interchangeSort(arr);
        System.out.println("Danh sách sau khi sắp xếp bằng Insertion Sort:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void interchangeSort(int[] arr){
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


