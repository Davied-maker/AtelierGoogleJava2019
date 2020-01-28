package lab3.visitor;

public class Visitor {
    private int totalPrice = 0;
    private int totalTime = 0;

    public void visit(Book book){
        totalPrice += book.getPrice();
        totalTime += book.getNrPages()*10;
    }
    public void visit(Video video){
        totalPrice+= video.getPrice();
        totalTime += video.getTime();
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getTotalTime() {
        return totalTime;
    }
}