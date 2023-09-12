import java.util.Scanner;
//needs correction
public class ReducedString {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(s);
            int i = 0;
            int end = sb.length() - 1;

            while (i < end && sb.length() != 2) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    end -= 2;
                    if (i > 0)
                        i--;
                } else
                    i++;
            }

            if (sb.length() == 0 || sb.length() == 2 && sb.charAt(0) == sb.charAt(1))
                System.out.println("Empty string");
else
            System.out.println(sb.toString());
        }
    }


