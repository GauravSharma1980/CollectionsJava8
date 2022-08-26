package deepak.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamVsCollections {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Gaurav");
        stringList.add("Saurav");

        stringList.stream().map(element->element.toUpperCase()).forEach(System.out::println);

        for (String s : stringList) {
            System.out.println(s);
        }


    }
}
