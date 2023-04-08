/*Write a program to create a HashMap of strings as keys and 
arrays of integers as values. Implement a method to find the
sum of all the integers in all the arrays in the HashMap.
Test case:
Input: { "One": [1, 2, 3], "Two": [4, 5], "Three": [6, 7, 8, 9] }
Output: 45 */
import java.util.*;
public class HashMap11 {
    public static void main(String[]args){
        HashMap<String,int[]> map = new HashMap<>();
        map.put("One",new int[]{1,2,3});
        map.put("Two",new int[]{4,5});
        map.put("Three",new int[]{6,7,8,9});
        int sum = 0;
        for(int[]array:map.values()){
           for(int num:array){
            sum+=num;
           }
        }
        System.out.println(sum);
    }
}
