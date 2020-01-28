package lab6.Lideri;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List content = new ArrayList();
        content.add(9);
        content.add(5);
        content.add(8);
        content.add(3);
        content.add(1);
        System.out.println(content);
        Leaders leaders = new Leaders(content);
        leaders.displayLeaders();

        List<Container> genericcontent = new ArrayList<Container>();
        genericcontent.add(new Container(3.4f));
        genericcontent.add(new Container(4.0f));
        genericcontent.add(new Container(3.2f));
        genericcontent.add(new Container(1.3f));
        System.out.println();
        GenericLeaders<Container> gLeaders = new GenericLeaders<Container>(genericcontent);
        gLeaders.displayLeaders();
    }
}
