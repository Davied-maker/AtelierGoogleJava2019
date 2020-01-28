package lab3.visitor;

public class Book implements Element {
private int price;
private int nrPages;
public Book(int price,int nrPages){
    this.price=price;
    this.nrPages=nrPages;
}

    public void accept(Visitor v) {
        v.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public int getNrPages() {
        return nrPages;
    }
}