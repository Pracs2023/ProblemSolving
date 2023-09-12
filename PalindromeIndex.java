import java.util.Scanner;

public class PalindromeIndex {
    public static void main(String[] args) {
            // Write your code here
Scanner sc = new Scanner(System.in);
String s = sc.next();

            int l = s.length();
            int i,j,a,b;
            for (i=0, j=l-1; i<l; i++,j--){
                if (s.charAt(i)!=s.charAt(j))
                    break;
            }
            if (i>j)
                System.out.println(-1);

            for (a = i+1, b = j;a<j && b>i+1; a++,b--){
                if (s.charAt(a)!=s.charAt(b))
                    System.out.println(j);
            }
        System.out.println(i);
        }
    }

