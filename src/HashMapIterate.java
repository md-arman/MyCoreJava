import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterate {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"First");
        map.put(2,"Second");
        map.put(3, "Third");

        System.out.println("****** for ******");
        for(Map.Entry<Integer, String> e: map.entrySet())
        {
            System.out.println("Key: " + e.getKey()+ " , Value: "+e.getValue());
        }


        System.out.println("****** forEach ******");
        map.forEach((k,v) -> System.out.println("Key: " +k+ " , Value: "+v));


        System.out.println("****** Iterator ******");
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry e = (Map.Entry) itr.next();
            System.out.println("Key: " + e.getKey()+ " , Value: "+e.getValue());
        }


    }
}
