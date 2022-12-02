import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task02 {

    public int countPassengers(ArrayList<int[]> stops) {
        int sum = stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
        return sum;
    }

    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        } else {
            int sum = Arrays.stream(input).filter(i -> i < 0).sum();
            long count = Arrays.stream(input).filter(i -> i > 0).count();
            System.out.println("sum : "+sum);
            System.out.println("count : "+count);
            return new int[]{(int)count,sum};
        }
            }
}