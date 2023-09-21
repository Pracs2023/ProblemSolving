import java.util.Scanner;
//chlra par TLE leet par
//optimised hai do line ka Integer.MIN_VALUE wgera use krke
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
}
