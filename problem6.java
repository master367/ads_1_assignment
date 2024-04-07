public class problem6 {
    public static int findExtended(int a, int n){
        if(n==0)
            return 1;
        else
            return a*findExtended(a,n-1);
    }
}
