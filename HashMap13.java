/*Write a program to create a HashMap of strings as keys and integers as values
.Implement a method to find the average value in the HashMap.
Test case:
Input: { "Apple": 10, "Banana": 5, "Orange": 7, "Mango": 15 }
Output: 9.25 */
import java.util.*;
public class HashMap13 {
   public static void main(String[]args){
    HashMap<String,Integer> map = new HashMap<>();
    map.put("Apple",10);
    map.put("Banana",5);
    map.put("Orange",7);
    map.put("Mango",15);
    int sum = 0;
    for(int x:map.values()){
        sum+=x;
    }
    double average = sum/map.size();
    System.out.print(average);
   } 
}
