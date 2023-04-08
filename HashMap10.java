/*Write a program to create a HashMap of characters as
 keys and integers as values. Implement a method to
 find the frequency of a given character in the HashMap.
 Test case:
 Input: { 'a': 2, 'b': 1, 'c': 3, 'd': 1 }
 Character to find: 'c'
 Output: 3 */
import java.util.*;
public class HashMap10 {
    public static int maxFreqchar(HashMap<Character,Integer> map){
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
        
        return maxCount;
    }
    public static void main(String[]args){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',2);
        map.put('b',1);
        map.put('c',3);
        map.put('d',1);
        System.out.println(maxFreqchar(map));
    }
}
