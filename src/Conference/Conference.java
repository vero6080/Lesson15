package Conference;

import java.util.HashSet;
import javax.swing.ImageIcon;

public class Conference {
    
    private String name, description;
    private HashSet <Guest> people;
    private ImageIcon image;
    
    public Conference(String n, String d, String img){
        name = n;
        description = d;
        image = new ImageIcon(getClass().getResource(img));
        people = new HashSet();
    }
    
    public boolean signup(Guest g){
        return true; //temporary
    }
    
    public boolean remove(Guest g){
        return true;//temporary
    }
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public HashSet<Guest> getPeople() {
        return people;
    }

    public ImageIcon getImage() {
        return image;
    }
}
