package lab4.Exception;

public class Main {
    public void iliterate(String[] strings) throws MyException{
        for(String s : strings)
        {
            if(s == null){
                throw new MyException("null element in array");
            }
            System.out.println("Element"+s);
        }
    }

    public void catchWithFinally(String[] args){
        String[] strings= new String [3];
        strings[0]="element 1";
        strings[1]=null;
        strings[2]="element 3";
        Main m=new Main();
        try{
            m.iliterate(strings);
            System.out.println("after exception in try");
        }catch(Exception e){
            System.out.println(e);
            strings[1]="something";
            System.out.println(strings[1]);
        }
        finally {
            System.out.println("Finally was executed");
        }
    }
    public void methodThatThrowsException()throws MyException{
        Main m= new Main();
        m.iliterate(new String[]{"el1",null,"el2"});
    }
public void methodThatTherowsRunExcepption(String s) throws RunException{
        if(s.equals("throw")){
            throw new RunException("Run Exception");
        }
}
    public static void main(String[] args) {
        Main m=new Main();
        try{
            m.methodThatThrowsException();
        }catch(Exception e){
            e.printStackTrace();;

        }
        try{
            m.methodThatTherowsRunExcepption("throw");
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("After RunEXception");
    }
}
