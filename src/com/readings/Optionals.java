package com.readings;


import java.util.Optional;
import java.util.function.Predicate;

public class Optionals {

    public static void main(String[] args) {

        String[] words = new String[10];

        Optional<String> checkNulls = Optional.ofNullable(words[5]);
        if(checkNulls.isPresent()){
            System.out.println("array index 5 is not empty"+checkNulls.get());
        }else{
            System.out.println("array is empty....");
        }

        Optional<String> empty = Optional.empty();
        System.out.println("empty.isPresent..."+empty.isPresent());

        String  name = "gaurav";
        Optional<String> opt = Optional.of(name);
        System.out.println("opt"+opt.isPresent());

        name = null;
        //Optional.of(name);//throw an null pointer exception, to avoid this we can use OfNullable

        Optional<String> opt1 =  Optional.ofNullable(name);
        System.out.println("isPresent()...."+opt1.isPresent());


        String opt2 = Optional.ofNullable(name).orElse("null name is there");

        System.out.println("opt2"+opt2);

        opt2  = Optional.ofNullable(name).orElseGet(()->"Gaurav");

        System.out.println("orElseGet:::"+opt2);

        Optionals optionals = new Optionals();
        optionals.callTry();

    }

    private void callTry() {
        //String text = "TEXT";
        String text = null;
        String defaultValue1 = Optional.ofNullable(text).orElseGet(this::getMyDefault);
        String defaultValue2 = Optional.ofNullable(text).orElse(getMyDefault());

        System.out.println("defaultValue1:: "+defaultValue1);
        System.out.println("defaultValue2:: "+defaultValue2);

        Integer year = 2018;

        Optional<Integer> yearOptional = Optional.of(year);
        System.out.println("Year Present 2018"+yearOptional.filter(yea-> yea == 2018).isPresent());

        System.out.println("Year Present 3456"+Optional.of(year).filter(yer->yer==3456).isPresent());

        Modem modem = new Modem();
        modem.setPrice(90);
       
    }



    private  String getMyDefault() {
        return "from getMyDefault";
    }

    private boolean priceInRange(Modem modem){
         return Optional.ofNullable(modem)
                .map(Modem::getPrice)
                .filter(value -> value > 10)
                .filter(value -> value < 15)
                .isPresent();

    }
}
