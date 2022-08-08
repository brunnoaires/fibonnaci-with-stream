import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        List<Integer[]> sum = Stream.iterate(new Integer[]{0, 1}, p -> new Integer[]{p[1], p[0] + p[1]})
                .limit(34)
                .filter(p -> p[0]%2 == 0).toList();

        Integer soma = 0;

        for(Integer[] integer : sum) {
            soma += integer[0];
            System.out.println(soma);

            }
        }
    }
