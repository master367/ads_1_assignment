public class problem4 {
    public static int factorialOfNumber(int n){
        if(n==1)
            return 1;
        else
            return n*factorialOfNumber(n-1);
    }
}
