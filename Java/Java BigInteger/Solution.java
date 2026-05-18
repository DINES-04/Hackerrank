import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String a= sc.nextLine();
        String b= sc.nextLine();
        BigInteger bi1 = new BigInteger(a);
        BigInteger bi2 = new BigInteger(b);
        
        BigInteger s = bi1.add(bi2);
        BigInteger m = bi1.multiply(bi2);
        
        System.out.println(s);
        System.out.println(m);
    }
}
