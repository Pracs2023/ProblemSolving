import java.util.Scanner;
//needs to be corrected
public class countFreqInRange {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] nums = new int[n];
           for(int i=0;i<n;i++)
               nums[i] = sc.nextInt();

            int[] freq = new int[n];
            int count =0;
            
            for(int i=0;i<n;i++)
            {
                if(freq[nums[i]-1]==0)
                {
                    count =0;
                    for(int j=i+1;j<n;j++)
                    {
                        if(nums[i]==nums[j])
                            count++;
                    }
                }
                freq[i]=count;
            }
        for(int i=0;i<n;i++)
            System.out.println(freq[i]+" ");
        }

}