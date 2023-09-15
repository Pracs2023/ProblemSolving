import java.util.HashMap;
import java.util.Scanner;

public class highestFreqCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(hm.containsKey(ch)==true)
                hm.put(ch,hm.get(ch)+1);
            else
                hm.put(ch,hm.getOrDefault(ch,1));
        }
        System.out.println(hm);
        int max = 0;
        for(Character key: hm.keySet())
        {
            Integer value = hm.get(key);
            if(value>max)
                max = value;
        }
final int temp = max;
        hm.forEach((key, value) -> {
            if(value == temp)
            System.out.print(key + "=" + value + " ");
        });



    }
}
