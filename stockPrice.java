import java.util.Scanner;
//chlra par TLE LC par
public class stockPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 0;
        int profit = 0;
        int max = 0;
        int end = n-1;
        int[] prices = new int[n];
        for(int i = 0; i < n; i++)
            prices[i] = sc.nextInt();
        optimised(prices,n);
        for(int i = 0 ; i < n ; i ++)
        {
            start = i;
            end = n-1;
            while(start < end)
            {
                if(prices[start] < prices[end])
                {
                    profit = prices[end] - prices[start];
                    max = (int)Math.max(max,profit);
                }
                end--;
            }
        }
        System.out.println(max);
    }
    //O(n)
    public static void optimised(int[] prices ,int n)
    {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        System.out.println(max);
    }
}
