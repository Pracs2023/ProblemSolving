import java.util.Scanner;

public class singleDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(singleDigit(n));
    }
    public static int singleDigit(int n)
    {
        if(n==0)
            return 0;
        return (n%9==0)?9:(n%9);
    }
}
