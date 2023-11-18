import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        int a = 10000000;
        int b = 1000000000;

        long sum = getSumBetween(a, b);
        System.out.println(sum);
    }
    public static long getSumBetween(int a, int b) {
        return LongStream.range(a, b).sum();
    }
}
