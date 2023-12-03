public class PaperFold {
    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return new String(arr);
    }

    public static String flip(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '^') {
                sb.append('v');
            } else if (c == 'v') {
                sb.append('^');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String paperFold(int n) {
        if (n == 1) {
            return "v";
        }
        String prev = paperFold(n - 1);
        return reverse(flip(prev)) + "v" + prev;
    }
}