
public class Arbeiter {
 

    String name;
    
    
    public Arbeiter( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Arbeiter [name=" + name+"]";
    }
    
   
}
