

public class rec01 {
    public static void main(String[] args) {
        // task is to print all number from 1-> n

        // expectation is that print num un will print 1-> 5
        printinc(6);
        System.out.println(" Now print in decreasing order ");
        printdec(6);
        System.out.println(" Now print factorial ");
        int ans = fect(6);
        System.out.println(ans);
        // System.out.println(fect(6));
    }
    public static void printinc(int num){
       // expectation - 1-> n
       // base case 
       if(num == 0) return;

       printinc(num-1);  // this is my faith that my recursion will print till n-1;
       // faith 
       System.out.println(num);
    }
    public static void printdec(int num){
        // expectation - n -> 1
        if(num == 0) return;

        System.out.println(num);
        printdec(num-1);  // this is my faith that my recursion will print till n-1;
        // faith 
        

       // faith 
    }
    public static int fect(int n){
        // base case 
        if( n == 0) return 1;


        // faith  -> recursion will give me the factorial of (n-1)
        int recAns = fect(n -1);
        int ans  = n * recAns;
        return ans;

        // return n* fect(n-1);
    }
}
