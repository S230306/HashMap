/*Write a program to create a HashMap of strings as keys and integers
  as values. Implement a method to check if all the values in the 
  HashMap are even.
  Test case:
  Input: { "Apple": 10, "Banana": 4, "Orange": 6, "Mango": 12 }
  Output: true */
import java.util.*;
public class HashMap12 {
    public static void main(String[]args){
        HashMap<String,Integer> map  = new HashMap<>();
        map.put("Apple",10);
        map.put("Banana",9);
        map.put("Orange",6);
        map.put("Mango",12);
        boolean allEven  = true;
        for(int x:map.values()){
            if(x%2!=0){
                allEven = false;
                break;
            }
        }
        System.out.print(allEven);
    }
}
