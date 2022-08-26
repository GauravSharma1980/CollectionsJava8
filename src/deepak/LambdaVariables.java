package deepak;

import java.util.function.Consumer;

public class LambdaVariables {

    public static void main(String[] args) {
        int var = 10;
        Consumer<Integer> consumerInteger = (var1) -> {
            //System.out.println("var"+var);
            //var++;
        };
        var++;
    }


}
