package lab1.challange1;

public class main {void FizzBuzz(){
    int i = 1;
    for(i = 1; i <= 100; i++) {
        if(i % 3 == 0){
            System.out.println("Fizz");
        }else {
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

    }
}
    public static void main(String args[]) {
        System.out.println("Atelierul Digital 2019");
        main a = new main();
        a.FizzBuzz();
    }
}

