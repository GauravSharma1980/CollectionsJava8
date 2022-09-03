package deepak.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstAndFindAny {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);

        Optional<Integer> optionalValue = intList.stream().filter(element->element>2).findAny();


        System.out.println(optionalValue.isPresent()?optionalValue.get():"null");

        optionalValue = intList.stream().filter(element->element>2).findFirst();

        System.out.println(optionalValue.isPresent()?optionalValue.get():"null");
    }
}
