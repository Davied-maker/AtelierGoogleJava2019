package lab1.challange1;

public class Pair {
    void findPairs(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i] + numbers[j] == 0){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
    public static void main(String[] args){
        Pair p = new Pair();
        int num[] =  new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=-2;
        num[4]=-3;
        p.findPairs(num);
    }
}

