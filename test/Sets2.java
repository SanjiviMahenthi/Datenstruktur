package test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets2 {
    
    public static void main(String[] args) {
        
    
    Set<Schueler> schueler = new HashSet<>();

    Schueler s1 = new Schueler("Meier","Max");
    Schueler s2 = new Schueler("Palme","Paul");

    schueler.add(s1);
    schueler.add(s2);

    System.out.println(schueler);

    schueler.remove(s2);
    System.out.println(schueler);

    //iterieren
    for (Schueler s : schueler) {
        System.out.println(s.getName());
        
    }
}

}