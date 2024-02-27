package lesson12;

public class StringProcessor {
    public static void main(String[] args) {
        String str = "Level";
        String result = " ";
        String s = "poop";
        reverseString(str, result);
        System.out.println(isPalindrome(s) ? "yes" : "no");

    }
    static void reverseString(String str, String result) {
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }
    private static boolean isPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0){
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }return false;




    }

}


