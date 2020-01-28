package lab7.rabbit;

public class Main {
    public static Thread createCorrespondThread(int nr){
        Thread toReturn;
        if(nr%2==0){
            toReturn=new RabbitThread(nr);
        }else{
            toReturn=new Thread(new RabbitRunnable(nr));
        }
        return toReturn;
    }
    public static void main(String[] args) {
     int nr =0;
     Thread t;
     while(nr < 10){
       //  System.out.println("nr="+nr);
         t= createCorrespondThread(nr);
         t.start();
         nr++;
     }
    }
}
