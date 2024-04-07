public class problem2 {
    public static double findAvg(int[] arr) {
        double avgButNotAvg = arr[0];

        for (int i = 1; i < arr.length; i++) {
            avgButNotAvg += arr[i];

        }
        return avgButNotAvg/ arr.length;
    }
}
