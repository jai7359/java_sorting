
public class insertionsort {
    public static void insertionm(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev] > curr) {
                arr[prev + 1 ] = arr[prev];
                prev--;

            }
            arr[prev+1] = curr;
        }
    }
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {8,9,6,5,2};
        insertionm(arr);
        printarr(arr);
    }
}