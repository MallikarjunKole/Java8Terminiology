package Java8Feature.streamAPI.basicOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetKeyOnTheBasisOfHashmapValue {

    public static void main(String[] args) {

        Map<List<Integer>,String> m=new HashMap<>();
        List<Integer> key= new ArrayList<>();
        key.add(1);
        m.put(key, "Value");
        key.add(2);

        for(Map.Entry<List<Integer>, String> res : m.entrySet()){
            System.out.println("Key : "+res.getKey()+" Value : "+res.getValue());
        }

        System.out.println("Key : "+key);
        System.out.println(m.get(key));
    }
}
