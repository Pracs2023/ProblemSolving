import java.util.Scanner;
//trick one line
public class RecursiveDigitSum {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String nt = sc.nextLine();
        int k = sc.nextInt();
        int n = Integer.valueOf(nt);
        int sum = 0;
        while(n!=0)
        {
            sum+=(n%10);
            n/=10;
        }
        n = sum*k;
        while(true)
        {
            sum= 0;
            while(n!=0)
            {
                sum += (n%10);
                n/=10;
            }
            if(sum<=9)
                break;
            else
                n = sum;
    }
        System.out.println(sum);
    }
}
