package lab3.visitor;

public class Main {
    public static void main(String[] args) {
        Element e1=new Book(10,200);
        Element e2=new Book(8,202);
        Element e3=new Book(12,204);

        Element v1=new Video(20,120);
        Element v2=new Video(22,100);

        Element[] elements=new Element[]{e1,e2,e3,v1,v2};
        Visitor visitor=new Visitor();
        for(Element e : elements){
            e.accept(visitor);
        }
        System.out.println("Price = " + visitor.getTotalPrice());
        System.out.println("Time = "+visitor.getTotalTime());
    }
}
