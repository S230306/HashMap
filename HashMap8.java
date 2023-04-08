/*Write a program to create a HashMap of student names and 
  their respective marks. Implement a method to get the highest
  mark from the HashMap.
  Test case:
  Input: { "John": 85, "Mary": 90, "Peter": 75, "David": 95 }
  Output: 95 */
import java.util.*;
public class HashMap8 {
    public static int HighestMark(HashMap<String,Integer> map){
        int maxMark = Integer.MIN_VALUE;
        for(int x:map.values()){
            if(x>maxMark){maxMark=x;}
        }
        return maxMark;
    }
    public static void main(String[]args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("John",85);
        map.put("Mary",90);
        map.put("Peter",75);
        map.put("David",95);
        System.out.println(HighestMark(map));
    }
}
