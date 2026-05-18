import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                String s= String.valueOf(x);
                //Complete this lin
                String str="";
                int l = 15 - s1.length();
                for(int j=0;j<l;j++){
                   str= str+" ";
                }
                if(x>=0 && x<=9)
                {
                    
                    System.out.println(s1+str+"00"+s);
                }
                else if(x>=10 && x<=99)
                {
                    System.out.println(s1+str+"0"+s);
                }
                else if(x>=100 && x<=999)
                {
                    System.out.println(s1+str+s);
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
            sc.close();
            System.out.println("================================");

    }
}



