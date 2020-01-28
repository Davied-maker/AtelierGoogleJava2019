package lab8.challange1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public void ex1(){
        List<String> list = new ArrayList<>(Arrays.asList("Apa","Birou","Cladire"));
       List l= list.stream().map(s-> s.charAt(0)).collect(Collectors.toList());

        System.out.println(l);
    }
    public void ex2(){
        List<String> list = new ArrayList<>(Arrays.asList("Apa","Birou","Cladire","Bloc"));
        List l= list.stream().filter(s-> s.length()%2!=0).collect(Collectors.toList());

        System.out.println(l);
    }
    public void ex3(){
        List<String> list = new ArrayList<>(Arrays.asList("Apa","Birou","Cladire"));
        List l= list.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(l);
    }
    public static void main(String[] args) {
        Stream s = new Stream();
        s.ex1();
        s.ex2();
        s.ex3();
    }
}
