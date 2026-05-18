import java.io.*;
import java.util.*;

class exp extends Exception{
    exp(String m){
        super(m);
    }
}
class divide extends Exception{
    divide(String a){
        super(a);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        Scanner sc= new Scanner(System.in);
        
        int a= sc.nextInt();
        int b= sc.nextInt();
        if((a>=-2147483648 && a<=2147483647) &&(b>=-2147483648 && b<=2147483647)){
            if(b==0){
                throw new divide("java.lang.ArithmeticException: / by zero");
            }
            else{
                int c=a/b;
                System.out.println(c);
            }
        }
        else{
            throw new exp("java.util.InputMismatchException");
        }
        }
        catch(exp e){
            System.out.println(e.getMessage());
        }
        catch(divide e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("java.util.InputMismatchException");
        }
    }
}
