package lab5.box;

import java.util.ArrayList;

public class Main {
    public static void displayContent(Box x){
        System.out.println(x.getContent());
        x.setContent(new ArrayList());
    }
    public static void displayGenericContent(GenericBox<ArrayList> x){
        System.out.println(x.getContent());
        x.setContent(new ArrayList());
    }
    public static void useSimpleBox(){
        Box stringBox = new Box();
        stringBox.setContent("String inside");
       Main.displayContent(stringBox);

        String s = (String)stringBox.getContent();


    }
    public static void useGenericBox(){
        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.setContent("String inside");
        //Main.displayGenericContent(stringBox);

        String s = (String)stringBox.getContent();
        System.out.println(s);
    }
    public static void main(String[] args) {
        Main.useGenericBox();

    }
}