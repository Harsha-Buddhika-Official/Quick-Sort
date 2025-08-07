import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        //user inputs array
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = Sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = Sc.nextInt();
        }
        Sc.close();

        //quick sort
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            // left side of pivot
            quickSort(arr, low, p-1);
            // right side of pivot
            quickSort(arr, p+1, high);
        }
    }

    public static int partition(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
            for(int j = low; j< high; j++){
                if(arr[j] < pivot){
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, high);
            return i + 1;
    }

    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}






















// public static void quickSort(int[] arr, int low, int high) {
//     if (low < high) {
//         int pivotIndex = partition(arr, low, high);
//         quickSort(arr, low, pivotIndex - 1);
//         quickSort(arr, pivotIndex + 1, high);
//     }
// }

// public static int partition(int[] arr, int low, int high) {
//     int pivot = arr[high];
//     int i = low - 1;
//     for (int j = low; j < high; j++) {
//         if (arr[j] < pivot) {
//             i++;
//             swap(arr, i, j);
//         }
//     }
//     swap(arr, i + 1, high);
//     return i + 1;
// }

// public static void swap(int[] arr, int i, int j) {
//     int temp = arr[i];
//     arr[i] = arr[j];
//     arr[j] = temp;
// }