package deepak.streams;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class maxvaluedemo {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int maxValue = calculateMaxValueUsingReduce(intList);

        System.out.println("the max value of the list is "+maxValue);

        Optional<Integer> optionalValue = calculateMaxValueUsingReduceOptional(new ArrayList<>());
        if(optionalValue.isPresent())
        {
            System.out.println("the value is "+ optionalValue.get());
        }
        else {
            System.out.println("there is no value present...");
        }

    }

    private static Optional<Integer> calculateMaxValueUsingReduceOptional(List<Integer> intList) {
            return intList.stream().reduce((a,b) -> a > b? a:b);
    }

    private static int calculateMaxValueUsingReduce(List<Integer> intList) {

        return intList.stream().reduce(0,(a,b)-> a>b ? a:b);
        
    }
}
