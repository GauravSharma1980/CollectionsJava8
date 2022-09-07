package com.challenges;

import java.util.Optional;
import java.util.stream.Stream;

public class Bug {
    public static void main(String[] args) {
        //Stream.of(1, 2, 3).filter(i -> { System.out.println(i); return true; }).findFirst();
        Optional<Integer> output = Stream.of(1, 2, 3).filter(i -> i> 0).findFirst();
        System.out.println(output.get());

        /*
        Stream.of(1, 2, 3)
                .flatMap(i -> Stream.of(i - 1, i, i + 1))
                .flatMap(i -> Stream.of(i - 1, i, i + 1))
                .filter(i -> { System.out.println(i); return true; })
                .findFirst();
         */

       /* Stream.of(1, 2, 3)
                .flatMap(i -> Stream.of(i - 1, i, i + 1)).forEach(System.out::println);
*/

        Stream.of(1, 2, 3)
                .flatMap(i -> Stream.of(i - 1, i, i + 1))
                .peek(element ->System.out.println("fist"+element))
                .flatMap(i -> Stream.of(i - 1, i, i + 1))
                .peek(element ->System.out.println("second"+element))
                .filter(i -> { System.out.println(i); return true; })
                .findFirst();

        System.out.println("Infinite result: " +
                Stream.of(0)
                        .flatMap(x->Stream.iterate(0, i->i+1))
                        .peek(element ->System.out.println("fistVal"+element))
                        .findFirst());
    }
}
