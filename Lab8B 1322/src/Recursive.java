public class Recursive {

    public static String repeatNTimes(String str, int n) {
        if (n == 0) {
            return "";
        } else {
            return str + repeatNTimes(str, n - 1);
        }
    }

    public static boolean isReverse(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else if (s1.length() == 0) {
            return true;
        } else {
            char c1 = s1.charAt(0);
            char c2 = s2.charAt(s2.length() - 1);
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            } else {
                return isReverse(s1.substring(1), s2.substring(0, s2.length() - 1));
            }
        }
    }
}
