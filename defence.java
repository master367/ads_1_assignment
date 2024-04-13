public class defence {
    public static boolean palindrom(String s){
        s = s.toLowerCase();

        if(s.isEmpty() || s.length() == 1)
            return true;

        if(s.charAt(0) == s.charAt(s.length()-1))
            return palindrom(s.substring(1, s.length()-1));

        return false;


    }
}
