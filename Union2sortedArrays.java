import java.util.ArrayList;
import java.util.Scanner;

public class Union2sortedArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ar = new int[n];
        int[] arr = new int [m];
        int i=0;
        for(i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        for(i = 0; i < m; i++)
            arr[i] = sc.nextInt();
        ArrayList<Integer> union = new ArrayList<>();
        int j = 0;
        i = 0;
        while(i<n && j<m)
        {
            if(ar[i]<=arr[j] )
            {
                if((union.size()==0   ||   union.get(union.size()-1) != ar[i]))
                union.add(ar[i]);
                i++;
            }
            if(ar[i]>arr[j] )
            {
                if(union.size()==0   ||   union.get(union.size()-1) != arr[j])
                union.add(arr[j]);
                j++;
            }
        }
        while(i<n)
        {
            if( union.get(union.size()-1) != ar[i])
                union.add(ar[i]);
            i++;
        }
        while(j<m)
        {
            if(  union.get(union.size()-1) != arr[j])
                union.add(arr[j]);
            j++;
        }
        System.out.println(union);

    }
}
