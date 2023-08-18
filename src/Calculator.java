public class Calculator {
    public static void main(String[] args) {
        boolean mult = isInrange(Integer.MAX_VALUE - 10);

        System.out.println("Is value in range of ints: " + mult);
    }

    static boolean isInrange(double n) {
        return n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE;
    }
}
