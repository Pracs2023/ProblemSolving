import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev="";
        for(int i= s.length()-1;i>=0;i--)
            rev+=s.charAt(i);
        int[] len1 = new int[s.length()];
        int[] len2 = new int[rev.length()];
        for(int i=0; i < s.length(); i++) {
            len1[i] = (int) s.charAt(i);
            len2[i] = (int) rev.charAt(i);
        }

        int[] ass1 = new int[len1.length-1];
        int[] ass2 = new int[len1.length-1];
        int k = 0;
        for(int i=0; i < ass1.length; i++)
        {
            ass1[k] = (int)(Math.abs(len1[i+1]-len1[i]));
            ass2[k] = (int)Math.abs(len2[i+1]-len2[i]);
            k++;
        }
boolean flag = false;
        for(int i = 0 ; i < ass1.length ; i ++)
        {
            if( ass1[i] != ass2[i] )
            {
                flag = true;
                break;
            }
        }
        if( flag == false )
            System.out.println("Funny");
        else
            System.out.println("Not Funny");


    }
}
