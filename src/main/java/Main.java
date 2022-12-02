import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Tasks tasks = new Tasks();

//        tasks.order("Thi1s is2 T4est 3a");
        Task02 task02 = new Task02();
        List<Double> integers = List.of(1.7, 3.9, 4.2, 5.5, 6.6, 7.1, 8.2, 9.1);

        double asDouble = integers.stream()
                .mapToDouble(Double::doubleValue)
                .average().getAsDouble();
        System.out.println(asDouble);


        //  task02.countPassengers(list);
        //task02.countPositivesSumNegatives( new  int[]{1,2,3,4,5,6,7,-5,-3,-8,-6,-2});

    }
}
