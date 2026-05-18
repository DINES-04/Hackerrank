import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        //Arrays.sort(s, Collections.reverseOrder());
       Arrays.sort(s, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        // Check for null values to prevent NullPointerException
        if (a == null || b == null) {
            return 0;
        }
        
        // Convert strings to BigDecimal
        BigDecimal bigDecA = new BigDecimal(a);
        BigDecimal bigDecB = new BigDecimal(b);
        
        // Compare BigDecimals in descending order
        return bigDecB.compareTo(bigDecA);
    }
});

        //Write your code here

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}