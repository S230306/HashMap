/*Basic Implementation of HashMap.*/
import java.util.HashMap;
import java.util.Map;
;
public class HashMap1{
    public static void main(String[]args){
        // initialoze HashMap.
        HashMap<String,Integer> map = new HashMap<>();
        // putting the value in map.
        map.put("Shailendra",23);
        map.put("Anisha",23);
        map.put("Purvi",24);
        map.put("Durga",34);
        System.out.println(map);
        //adding dublicate - dublicate is not allowed.
        map.put("Anisha",24);
        System.out.println(map);
        // traversal in HashMap.
        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}