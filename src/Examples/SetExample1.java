package Examples;

import java.util.HashSet;

public class SetExample1 {

    public static void main(String[] args) {
        HashSet <String> ball = new HashSet<String>();
        
        ball.add("Pikachu");
        System.out.println("Pikachu".hashCode());
        ball.add("Charmander");
        System.out.println("Charmander".hashCode());
        ball.add("Squirtle");
        System.out.println("Squirtle".hashCode());
        ball.add("Butterfree");
        System.out.println("Butterfree".hashCode());
        
        ball.add("Pikachu"); //won't show up - must be unique
        
        System.out.println(ball);
    }
    
}
