/*Write a program to create a HashMap of integers as keys and
  strings as values. Implement a method to print all the values
  in the HashMap.
  Test case:
  Input: { 1: "One", 2: "Two", 3: "Three", 4: "Four" }
  Output: One, Two, Three, Four */
  import java.util.*;

  public class HashMap9 {
      public static void main(String[] args) {
          HashMap<Integer, String> map = new HashMap<>();
          map.put(1, "One");
          map.put(2, "Two");
          map.put(3, "Three");
          map.put(4, "Four");
  
          StringBuilder sb = new StringBuilder();
          for (String x : map.values()) {
              sb.append(x).append(",");
          }
          String result = sb.substring(0, sb.length()-1);
          System.out.println(result);
      }
  }
  