/*Write a Java program to remove an element from a HashMap. */
import java.util.*;
public class HashMap4 {
   public static void main(String[]args){
    HashMap<String,Integer> map = new LinkedHashMap<>();// linkedHashMap is used to prereserved the insertion order.
    map.put("String",1);
    map.put("Array",2);
    map.put("Queue",3);
    map.put("HashSet",4);
    map.put("Stack",5);
    map.put("PriorityQueue",6);
    map.put("HashTable",7);
    map.put("HashMap",8);
    System.out.println(map);
    map.remove("HashMap");
    System.out.println(map);
   } 
}
