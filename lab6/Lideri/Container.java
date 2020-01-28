package lab6.Lideri;

public class Container implements Comparable<Container>{
    private float size;
    public Container(float size){
        this.size=size;
    }

    @Override
    public int compareTo(Container o) {
        if(size == o.size)
        return 0;
        if(size < o.size)
            return -1;
        return  1;
    }

    @Override
    public String toString(){
        return "size:" +size;
    }
}
