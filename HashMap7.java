/*Write a Java program to convert a HashMap to an ArrayList. */
import java.util.*;
public class HashMap7 {
    public static void main(String[]args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("John",85);
        map.put("Mary",90);
        map.put("Peter",75);
        map.put("David",95);
    ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
    for (Map.Entry<String, Integer> entry : list) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
    }
}
