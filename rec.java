
public class rec {
    public static void main(String[] args) {
        
        print0(0);
    }
    public static void print0(int count ){
        System.out.println(count);
        if(count == 0){
            System.out.println("Ho gaya mera kam");
        } 

        System.out.println("Hey I have been callled!   " + count+"th  time");
        print0(count +1);
    }
}
