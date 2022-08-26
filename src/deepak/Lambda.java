package deepak;

import java.util.function.Function;

public class Lambda {

    static Function<String,String> function = (name)->name.toUpperCase();

    static Function<String,String> functionConcat = (name)->name.toUpperCase().concat("Sharma");

    public static void main(String[] args) {

        System.out.println(function.apply("Gaurav"));

        String output = function.andThen(functionConcat).apply("Gaurav");

        System.out.println("the overall o/p is "+output);

        output = function.compose(functionConcat).apply("Ram");

        System.out.println(output);






    }
}
