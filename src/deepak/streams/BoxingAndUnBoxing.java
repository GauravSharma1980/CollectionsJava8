package deepak.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingAndUnBoxing {

    public static void main(String[] args) {

        //primitive to Wrapper is boxing
        List<Integer> intList = IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());

        intList.forEach(System.out::println);

        //Wrapper to primitive is unboxing
        intList.stream().mapToInt(Integer::intValue).forEach(System.out::println);

        System.out.println("sum "+unboxing(intList));
    }

    private static int unboxing(List<Integer> intList) {
        return intList.stream().mapToInt(Integer::intValue).sum();
    }
}
