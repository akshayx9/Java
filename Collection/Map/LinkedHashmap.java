package Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("Java",100);
        map.put(".net", 10);
        map.put("php",500);
        System.out.println(map.keySet());
        System.out.println(map.values());

        @SuppressWarnings("rawtypes")
        Set entry=map.entrySet();
        @SuppressWarnings("rawtypes")
        Iterator itr=entry.iterator();
        while(itr.hasNext()){
            @SuppressWarnings("rawtypes")
            Map.Entry ent=(Map.Entry)itr.next();
            System.out.println(ent.getKey()+"---"+ent.getValue());
        }
    }
}
