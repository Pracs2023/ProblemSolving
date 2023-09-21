import java.util.Scanner;
//O(n^2) longestSub
public class LongestSubSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        longestSub(arr,n,target);
    }
        public static void longestSub(int[] arr, int n, int target)
        {
            int max = 0;
            for(int i = 0; i < n; i++)
            {
                int sum = 0;
                for(int j = i; j < n; j++)
                {
                    sum = sum + arr[j];
                    if(sum == target)
                      max = (int)Math.max(max,j-i+1);
                }
            }
            System.out.println(" Maximum length for subarray with sum "+target+" is "+max);
        }

    }

