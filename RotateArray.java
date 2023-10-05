import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++)
            nums[i] = sc.nextInt();
                k = k % n;
        for(int i : nums)
            System.out.print(i + ",");
                int start = 0;
                int end = k-1;
                while(start <= end)
                {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start++;
                    end--;
                }
        System.out.println();
        for(int i : nums)
            System.out.print(i + ",");
//
                start = k;
                end = n-1;
                while(start <= end)
                {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start++;
                    end--;
                }
        System.out.println();
        for(int i : nums)
            System.out.print(i + ",");
//
                start = 0;
                end = n-1;
                while(start <= end)
                {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start++;
                    end--;
                }
        System.out.println();
        for(int i : nums)
            System.out.print(i + ",");

            }
        }
