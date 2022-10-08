import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        List<Integer> number = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            number.add((int) (Math.random() * 100 + 100));
        }

       List<String> list = number.stream()
               .filter(n -> n % 4 == 0 && n % 5 == 0)
               .map(n -> Math.sqrt(n))
               .map(n -> "Square root: " + n)
               .collect(Collectors.toList());

        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}
