import java.util.*;
import java.math.*;
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double total=0;
            int intotal=0;
            for(int j=1;j<=n;j++)
            {
                if(j==1)
                {
                    total=a+(Math.pow(2,j-1)*b);
                    intotal=(int)Math.round(total);
                    System.out.print(intotal+" ");
                }
                else{
                    total=total+(Math.pow(2,j-1)*b);
                    intotal=(int)Math.round(total);
                    System.out.print(intotal+" ");
                }
            }
            System.out.print("\n");
            
        }
        in.close();
    }
}
