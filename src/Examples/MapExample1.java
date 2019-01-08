package Examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample1 {

    public static void main(String[] args) {
        HashMap <String,String> prov = new HashMap<String,String>();
        prov.put("ON", "Toronto");
        prov.put("PE", "Charlottetwon");
        prov.put("NF", "St.Johns");
        prov.put("NS", "Halifax");
        prov.put("NB", "Fredericton");
        prov.put("PQ", "Quebec City");
        prov.put("MB", "Winnipeg");
        prov.put("SK", "Regina");
        prov.put("AB", "Edmonton");
        prov.put("BC", "Victoria");
        System.out.println(prov);
        
        System.out.println("The capital of BC is " + prov.get("BC"));
        System.out.println("Changing BC Capital");
        prov.replace("BC", "Vancouver");
        
        Iterator it = prov.entrySet().iterator();
        while(it.hasNext())
            System.out.println(it.next());
        
        for (Map.Entry<String, String> entry : prov.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("The capital of " + key + " is " + value);
        }
    }
}
