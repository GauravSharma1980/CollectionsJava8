package deepak.streams;

import java.util.stream.IntStream;

public class RangeExample {

    public static void main(String[] args) {

        int sum =  IntStream.range(1,6).sum();
        System.out.println("the sum is "+sum);

        sum = IntStream.rangeClosed(1,6).sum();
        System.out.println("the sum is "+sum);

        IntStream stream = IntStream.rangeClosed(1,10).map( operand -> operand * 2 );
        System.out.println("the result is as follows....");
        stream.forEach(System.out::println);

        IntStream.rangeClosed(1,10).asDoubleStream().forEach(System.out::println);

        IntStream.rangeClosed(1,10).asLongStream().forEach(System.out::println);

        sum = IntStream.rangeClosed(1,10).sum();

        System.out.println("sum is "+ sum);

        sum = IntStream.rangeClosed(1,10).reduce(0,(a,b)->a+b);

        System.out.println("sum is "+sum);

        int min = IntStream.rangeClosed(1,10).min().orElseGet(null);

        System.out.println("the min value is"+min);

        min = IntStream.rangeClosed(1,10).reduce((a,b)-> a > b? b:a).orElseGet(null);

        System.out.println("the min value is "+min);
    }
}
