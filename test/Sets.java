package test;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        
    //Set erstellen; Hier kann auch Hashset am anfang Stehen, ist das gleiche wie unten
    //Hashset<String> mitarbeiterSet = new HashSet<>();
    Set<String> mitarbeiterSet = new HashSet<>();
    
    
    //Anschließend rufen wir die Methode „add()“ auf, um die beiden Elemente „Alex“ und „Paul“ in das „mitarbeiterSet“ einzufügen:
    mitarbeiterSet.add("Alex"); 
    mitarbeiterSet.add("Paul");  
    System.out.println(mitarbeiterSet);
    
    System.out.println("");
    //Mit .size erhält man die größe eines Sets
    System.out.println("Du hast so viele Mitarbeiter im Team: " + mitarbeiterSet.size());

    System.out.println("");

    //.contains um etwas zu suchen; dabei bekommt man "true/false" zurück
    if(mitarbeiterSet.contains("Paul"))
    {
        System.out.println("Paul ist ein Mitarbeiter");
        
    }
    }
}