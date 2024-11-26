package test;


public class Schueler {
    String Name;
    String Vorname;

    //Konstruktor
    public Schueler(String name, String vorname) {
        Name = name;
        Vorname = vorname;
    }

    //Getter & Setter
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getVorname() {
        return Vorname;
    }
    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name des Schülers" + Vorname + " " + Name;
    }


}
 
