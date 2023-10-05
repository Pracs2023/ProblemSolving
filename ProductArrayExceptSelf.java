import java.util.Scanner;
//prefix sum and postfix sum
public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++)
            nums[i] = sc.nextInt();
        int product = 1;
        int[] ans = new int[n];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]!=0)
                product *= nums[i];
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]==0)
                ans[i] = 0;
            else
                ans[i] = product/nums[i];
        }
    }
}
