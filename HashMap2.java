/*Write a Java program to find the most occurring word in a given
 text using HashMap. */
import java.util.*;
public class HashMap2 {
    public static char MostOccur(String str){
     HashMap<Character,Integer> map = new HashMap<>();
     for(int idx=0;idx<str.length();idx++){
        char ch = str.charAt(idx);
        map.put(ch,map.getOrDefault(ch,0)+1);
     }
     char mostOccurringChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount) {
                 maxCount = count;
                mostOccurringChar = ch;
            }
        }
        
        return mostOccurringChar;
    }

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(MostOccur(str));
    }
}
