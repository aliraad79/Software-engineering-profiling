public class Calculator {
    public static void main(String[] args) {
        boolean mult = isInrange(Integer.MAX_VALUE - 10);

        System.out.println("Is value in range of ints: " + mult);
    }

    static boolean isInrange(int n) {
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if (i == n)
                return true;
        }
        return false;
    }
}
