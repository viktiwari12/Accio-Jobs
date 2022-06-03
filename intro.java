import java.security.Principal;

class intro {
    public static void main(String[] args) {
        int num = 1;
        print0(1); //you can pass num 
    }
    public static void print0(int num){
        System.out.println(num);
        print1(num +1);

    }
    public static void print1(int num){
        System.out.println(num);
        print2(num +1 );
    }
    public static void print2(int num){
        System.out.println(num);
        print3(num +1  );
    }
    public static void print3(int num){
        System.out.println(num);
        print4(num +1 );
        
    }
    public static void  print4(int num){
        System.out.println(num);
    }
}