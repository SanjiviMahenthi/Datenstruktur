import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UebungMaps {

    public static void main(String[] args) {
        
        Map<String, String> uebungMap = new HashMap<>();

        uebungMap.put("BadenWürttemberg", "Stuttgart");
        uebungMap.put("Berlin", "Berlin");
        uebungMap.put("Bayern", "München");
        uebungMap.put("Bremen", "Bremen");
        uebungMap.put("Hamburg", "Hamburg");


        System.out.println(uebungMap);

        for (String i : uebungMap.keySet()) {
            System.out.println(i.getKey() + " " + uebungMap.getValue(i));
        }

        System.out.println("-----------------Liste der Bundesländer-----------------------------");
        List<String> bundeslaender = new ArrayList<>(uebungMap.keySet());
        for (String s : bundeslaender) {

            System.out.println(s);
            
        }
        System.out.println("-----------------Liste der Bundesländer-----------------------------");
        List<String> hauptstaedte = new ArrayList<>(uebungMap.keySet());
       for (uebungMap.entrySet() s : uebungMap.keySet) {
            System.out.println( " " + m.getValue(i));
        }



    }
    
}
