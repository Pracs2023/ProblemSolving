import java.util.Scanner;
//hashing for returning indices
//two pointer optimised when indices not required
public class twoSum {
    public static void main(String[] args) {
        //ye to O(n^2)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        boolean flag = false;
        for(int i =0;i<n;i++)
        {
             flag = false;
            for(int j = i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    flag = true;
                    System.out.println("YES");
                    break;
                }

            }
            if(flag == true)
                break;
        }
        if(flag == false)
            System.out.println("NO");
    }
}
