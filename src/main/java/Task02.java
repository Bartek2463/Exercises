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

        return input==null || input.length==0 ? new int[]{0}:
                new int[]{(int)IntStream.of(input).filter(value -> value>0).count(),
                         IntStream.of(input).filter(value -> value<0).sum()};

    }
}