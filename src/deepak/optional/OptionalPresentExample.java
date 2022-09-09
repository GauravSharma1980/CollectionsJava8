package deepak.optional;

import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {

        Optional<String> optionalStr =  Optional.ofNullable("Hello World");
        System.out.println(optionalStr.isPresent() );
        optionalStr.ifPresent((str)-> System.out.println(str) );


    }
}
