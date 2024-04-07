public class problem8 {
    public static boolean checkForLetters(String s) {

        if (s.isEmpty()) {
            return false;
        }


        char firstChar = s.charAt(0);
        if (Character.isLetter(firstChar)) {
            return true;
        }


        return checkForLetters(s.substring(1));
    }
}
