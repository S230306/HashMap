/*Write a Java program to check if a key exists in a HashMap. */
import java.util.*;
public class HashMap5 {
    public static void main(String[]args){
     Scanner scn = new Scanner(System.in);
        HashMap<String,Integer> map = new LinkedHashMap<>();// linkedHashMap is used to prereserved the insertion order.
        map.put("String",1);
        map.put("Array",2);
        map.put("Queue",3);
        map.put("HashSet",4);
        map.put("Stack",5);
        map.put("PriorityQueue",6);
        map.put("HashTable",7);
        map.put("HashMap",8);
        String k = scn.next(); 
        for(Map.Entry<String,Integer> e : map.entrySet()){
            if(map.keySet().contains(k)){
                System.out.println(true);
                return;
            }else{
                System.out.println(false);
                return;
            }
        }
    }
}
