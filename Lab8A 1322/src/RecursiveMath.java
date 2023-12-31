public class RecursiveMath {

    public static int recursive_multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + recursive_multiply(a, b - 1);
    }

    public static int recursive_div(int a, int b) {
        if (b == 0) {
            return -1;
        }
        if (a == b) {
            return 1;
        }
        if (a < b) {
            return 0;
        }
        return 1 + recursive_div(a - b, b);
    }

    public static int recursive_mod(int a, int b) {
        if (b == 0) {
            return -1;
        }
        if (a < b) {
            return a;
        }
        return recursive_mod(a - b, b);
    }
}

