package deepak.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static void main(String[] args) {

        // when we are not certain that the value is null or not then we use ofNullable method
          Optional<String> optionalValue =  Optional.ofNullable("Gaurav");
          Optional<String> optionalValueNull =  Optional.ofNullable(null);
        System.out.println(optionalValueNull.isPresent()?optionalValueNull.get():Optional.empty());
        System.out.println(optionalValue.isPresent()?optionalValue.get():Optional.empty());

        Optional<String> str = Optional.of("Gaurav");
        System.out.println("the o/p of 'of'"+str);

        //Null Pointer Exception....// use only when no null value is there
        str = Optional.of(null);
        System.out.println("the o/p of 'of'"+str);


    }
}
