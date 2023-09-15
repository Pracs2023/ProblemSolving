import java.util.*;
public class DistinctprimeFactors
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int [n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println(DistinctPrimeFactors(6));
    }
    public static int DistinctPrimeFactors(int n)
        {
            boolean[] prime = new boolean[n+1];
            for(int i =0;i<n;i++)
                prime[i] = true;
            for(int i =2;i*i<=n;i++)
            {
                if(prime[i]==true)
                {
                    for(int p = i*i;p<=n;p+=i)
                        prime[p] = false;
                }
            }
            int count = 0;
            for(int i=2;i<=n;i++)
            {
                if(prime[i]==true)
                    count ++;
            }
            return count ;
        }




}
