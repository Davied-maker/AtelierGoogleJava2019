package lab4.challange1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneBook {
    private  Scanner s=null;
    private Contact[] contacts=new Contact[10];
    private int count=0;
    public PhoneBook(String filePath){
        try{
        FileReader fr=new FileReader(filePath);
        BufferedReader br= new BufferedReader(fr);
        Scanner s =new Scanner(br);
        this.s=s;
        }
        catch (Exception e){
            e.printStackTrace();
            }
    }
    public void importContacts(){

        String name;
        Double number;
        while(s.hasNext()){
            name=s.next();
            if(s.hasNextDouble()){
                number=s.nextDouble();
                contacts[count]=new Contact(name,number);
                count++;
            }
        }
    }
    public void displayContacts(){
        int i;
        for(i=0;i<count;i++){
            System.out.println(contacts[i]);
        }
    }
    public void displaySingleContact(String name){
        int i;
      for(i=0;i<count;i++){
          if(contacts[i].getName().equals(name)){
              System.out.println("Phone number" + contacts[i].getPhoneNumber() );
          }
      }
    }
}
