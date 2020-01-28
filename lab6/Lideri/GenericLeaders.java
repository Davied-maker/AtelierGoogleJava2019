package lab6.Lideri;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GenericLeaders <T extends Comparable>{
    private List<T> content = null;
    public GenericLeaders(List<T> content){
        this.content=content;
    }
    public void displayLeaders(){
        Collections.reverse(content);
        System.out.println(content);

        T max=content.get(0);
        System.out.print(max);
        Iterator<T> it = content.iterator();
        while(it.hasNext()){
            T current=it.next();
            if(max.compareTo(current)<0){
                max=current;
                System.out.print(" "+ max);
            }
        }
    }
}
