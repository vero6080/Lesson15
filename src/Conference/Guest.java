package Conference;

public class Guest {
    
    String email;
    String name;
    
    //use for signup
    public Guest(String e, String n){
        email = e;
        name = n;
    }
    
    //use for remove
    public Guest(String info){
        //converts "username<email>" String to a Guest
        int div = info.indexOf("<");
        name = info.substring(0, div);
        email = info.substring(div + 1, info.length() - 1);
    }
    
    public String toString(){
        return name + "<" + email + ">";
    }
}
