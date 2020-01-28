package lab6.Lideri;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Leaders {
    private List<Integer> content = null;
    public Leaders(List<Integer> content){
        this.content=content;
    }
    public void displayLeaders(){
        Collections.reverse(content);
        System.out.println(content);

        int max=content.get(0);
        System.out.print(max);
        Iterator<Integer> it = content.iterator();
        while(it.hasNext()){
            int current=it.next();
            if(max<current){
                max=current;
                System.out.print(" "+ max);
            }
        }
    }
}
