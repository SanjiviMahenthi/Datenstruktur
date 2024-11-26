import java.util.HashMap;

public class TestMaps {


    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        
        System.out.println("\033[H\033[2J");
        System.out.flush();

        HashMap<IDs, Arbeiter> MeineMap = new HashMap<>();

        IDs I1 = new IDs(1);
        Arbeiter A1 = new Arbeiter( "John Smith");
        

       MeineMap.put(I1, A1);

       System.out.println(MeineMap);
        
    }
}
