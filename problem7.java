public class problem7 {
    public static void reversedArray(int[] arr, int firstE, int lastE) {

        if (firstE >= lastE) {
            return;
        }

        int temp = arr[firstE];
        arr[firstE] = arr[lastE];
        arr[lastE] = temp;

        reversedArray(arr, lastE + 1, lastE - 1);
    }
}
