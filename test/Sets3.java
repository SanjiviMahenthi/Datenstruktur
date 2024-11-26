package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets3 {
    public static void main(String[] args) {
        
    Set<Integer> erstesSet = new HashSet<Integer>();
    erstesSet.addAll(Arrays.asList(new Integer[] {1, 2, 3, 5, 0 }));
    Set<Integer> zweitesSet = new HashSet<Integer>();
    zweitesSet.addAll(Arrays.asList(new Integer[] {1, 3, 4, 5, 6, 7, 5})); 

    System.out.println(erstesSet);
    System.out.println(zweitesSet);
    System.out.println("");
    System.out.println("Durch .addall() werden die Sets vereiningt und eine Schnittmenge wird erstellt");
    System.out.println("");

    //Neues Set um die ersten beiden zu vereiningen
    Set<Integer> union = new HashSet<Integer>(erstesSet);

    union.addAll(zweitesSet);

    System.out.print("Beide Sets zusammengeführt ergibt:");
    System.out.println(union);

    System.out.println("");

    Set<Integer> schnittmenge = new HashSet<>(erstesSet);
    
    schnittmenge.retainAll(zweitesSet);
    System.out.print("Die Schnittmenge beider Sets ist:");
    System.out.println(schnittmenge);

    System.out.println("");
    // Die Differenz der Elements

    Set<Integer> differenz = new HashSet<Integer>(erstesSet);
    differenz.removeAll(zweitesSet);
    System.out.print("Diese Elemente sind nicht im zweiten Set vorhanden:");
    System.out.println(differenz);

    }
}
