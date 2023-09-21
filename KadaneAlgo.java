import java.util.Scanner;
public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(maxSum(arr,n));
    }
    public static int maxSum(int[] nums, int n)
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            if(sum == 0)
                start = i;
            sum += nums[i];
            if(sum>max)
            {
                max = sum;
                end = i;
            }
            max = (int)Math.max(sum,max);
            if (sum < 0)
                sum = 0;
        }
        for(int i = start; i <= end; i++)
            System.out.print(nums[i]+" ");
        System.out.println();
        return max;
    }

}
