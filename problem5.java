public class problem5 {
    public static int findElementOfFibonacci(int n){
        if(n <= 1)
            return n;
        else
            return findElementOfFibonacci(n-1) + findElementOfFibonacci(n-2);

    }
}
