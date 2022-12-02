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

     return input==null||input.length==0?new int[]{0}:new int[]{IntStream.of(input).filter(t->t>0).sum()
     ,IntStream.of(input).filter(r->r<0).sum()};

    }


}