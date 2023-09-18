import java.util.*;
public class DistinctprimeFactors_SOE
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DistinctPrimeFactors(6);

    }
    public static void DistinctPrimeFactors(int n)
        {
            boolean[] prime = new boolean[n+1];
            for(int i =2;i*i<=n;i++)
            {
                if(prime[i]==false)
                {
                    for(int p = i*i;p<=n;p+=i)
                        prime[p] = true;
                }
            }
            for(int i=2;i<=n;i++)
            {
                if(prime[i]==false)
                    System.out.print(i+" ");
            }
        }




}
