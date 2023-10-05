import java.util.Scanner;

public class travelSortedBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int start = 0;
        int end = n -1;
        int mid = 0;
        while(start <= end)
        {
             mid = start + (end-start)/2;
            if(target == arr[mid])
                break;
            if(target > arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        System.out.println(mid+1);

    }
}
