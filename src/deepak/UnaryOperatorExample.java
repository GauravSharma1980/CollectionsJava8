package deepak;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        Function<String,String> strFunction  = (name) -> name.toUpperCase();
        UnaryOperator<String> strUnaryOperator = (name)->name.concat("Is Great!!!!");

        String strOutput  = strUnaryOperator.andThen(strFunction).apply("Gaurav");
        //String strOutput = strUnaryOperator.apply("Gaurav");

        System.out.println("strOutput"+strOutput);


    }
}
