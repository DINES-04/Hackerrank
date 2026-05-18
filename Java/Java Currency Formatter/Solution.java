import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String us(double a){
        Locale lo= new Locale("en","US");
        NumberFormat nf= NumberFormat.getCurrencyInstance(lo);
        String formated= nf.format(a);
        return formated;
    }
    public static String india(double a){
        Locale lo= new Locale("en","IN");
        NumberFormat nf= NumberFormat.getCurrencyInstance(lo);
        String formated= nf.format(a);
        return formated;
    }
    public static String china(double a){
        Locale lo= new Locale("zh","CN");
        NumberFormat nf= NumberFormat.getCurrencyInstance(lo);
        String formated= nf.format(a);
        return formated;
    }
    public static String france(double a){
        Locale lo= new Locale("fr","FR");
        NumberFormat nf= NumberFormat.getCurrencyInstance(lo);
        String formated= nf.format(a);
        return formated;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        
        System.out.println("US: " + us(payment));
        System.out.println("India: " + india(payment));
        System.out.println("China: " + china(payment));
        System.out.println("France: " + france(payment));
    }
}
