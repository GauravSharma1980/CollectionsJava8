package deepak.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToObject {


    public static void main(String[] args) {
        List<Integer> lst = mapToObject();
        System.out.println(lst);
    }

    private static List<Integer> mapToObject(){
        return IntStream.rangeClosed(1,6).mapToObj(value -> Integer.valueOf(value)).collect(Collectors.toList());

    }
    private static long mapToLong(){
        return IntStream.rangeClosed(1,6).mapToLong(element->element).sum();
    }
}
