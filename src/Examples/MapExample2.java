package Examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample2 {

    public static void main(String[] args) {
        /*
        HashMap <String,Pokemon> bp = new HashMap<String,Pokemon>();
        bp.put("Electric", new Pokemon("Pikachu", 25));
        bp.put("Grass", new Pokemon("Bulbasaur", 1));
        bp.put("Fire", new Pokemon("Charmander", 7));
        bp.put("Electric", new Pokemon("Raichu", 26)); //replaces Pikachu
        System.out.println(bp);
        */
        
        HashMap <String,HashSet<Pokemon>> ap = new HashMap <String,HashSet<Pokemon>>();
        
        ap.put("Electric", new HashSet());
        ap.put("Water", new HashSet());
        ap.put("Grass", new HashSet());
        
        ap.get("Electric").add(new Pokemon("Pikachu", 25));
        ap.get("Electric").add(new Pokemon("Raichu", 26));
        ap.get("Electric").add(new Pokemon("Voltorb", 100));
        
        ap.get("Water").add(new Pokemon("Squirtle", 7));
        ap.get("Water").add(new Pokemon("Blastoise", 9));
        
        ap.get("Grass").add(new Pokemon("Bulbasaur", 1));
        ap.get("Grass").add(new Pokemon("Ivysaur", 2));
        ap.get("Grass").add(new Pokemon("Venasaur", 3));
        ap.get("Grass").add(new Pokemon("Vileplume", 45));
        
        System.out.println("Here are the types (keys)");
        Set types = ap.keySet();
        Iterator it = types.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
            
        }
        
        System.out.println("Here are the grass Pokemon");
        Set grass = ap.get("Grass");
        it = grass.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
            
        }
        
    }
    
}
