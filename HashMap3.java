/*Given two arrays of integers, write a Java program 
  to find the common elements between the two arrays using HashMap. */
import java.util.*;
public class HashMap3 {
    public static void HahMapCommmElem(int[]arr1,int[]arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int idx=0;idx<arr1.length;idx++){
            if(arr1[idx]==arr2[idx]){map.put(arr1[idx],idx);}
        }
        for(int x:map.keySet()){
            System.out.print(x+" ");
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr1 = new int[n];
        for(int idx=0;idx<arr1.length;idx++){
            arr1[idx] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[]arr2 = new int[m];
        for(int idx=0;idx<arr2.length;idx++){
          arr2[idx] = scn.nextInt();
        }
        HahMapCommmElem(arr1,arr2);
    }
}
