package deepak;

import com.domain.Student;
import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;
import java.util.function.Function;



public class MethodRefernce {

    //Alt+Enter for the change to the following into method reference.
    static Function<String,String> toUpperCaseLambda = (s) -> s.toUpperCase();
    static Function<String,String> getToUpperCaseLambda_mtd_ref = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("Gaurav"));
        System.out.println(getToUpperCaseLambda_mtd_ref.apply("Gaurav"));
        Student student = new Student("Gaurav",80);

    }
}
