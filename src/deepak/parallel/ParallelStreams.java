package deepak.parallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreams {

    private static int sumSequentialStream(){
        return IntStream
                .rangeClosed(1,10000)
                .sum();
    }
    private static int sumParallelStream(){
        return IntStream
                .rangeClosed(1,10000)
                .parallel()
                .sum();
    }

    private static long callSumStreamMethod(Supplier<Integer> supplier,int numberOfTimes){

        long startTimeInMillis = System.currentTimeMillis();
        for(int i = 0;i<numberOfTimes;i++){
            supplier.get();
        }
        long endTimeInMillis = System.currentTimeMillis();

        return endTimeInMillis - startTimeInMillis;
    }

    public static void main(String[] args) {

        System.out.println("parallel stream time taken::  "+ParallelStreams.callSumStreamMethod(ParallelStreams::sumParallelStream,20));
        System.out.println("sequential stream time taken:: "+ParallelStreams.callSumStreamMethod(ParallelStreams::sumSequentialStream,20));
    }
}
