package lab4.challange1;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb=new PhoneBook("src\\lab4\\challange1\\PhoneBook");
        pb.importContacts();
        pb.displayContacts();
        pb.displaySingleContact("Ioana");
    }
}
