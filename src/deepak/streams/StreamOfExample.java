package deepak.streams;

import java.util.stream.Stream;

public class StreamOfExample {
    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("gaurav","gauri","saurav");

        stringStream.forEach(System.out::println);
    }
}
