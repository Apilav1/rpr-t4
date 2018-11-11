package ba.unsa.etf.rpr.zd1;

import java.util.Set;

public class Predmet {
    String nazivPredmeta;
    int ETCbodovi;
    private static Set<Student> studenti;
    public Predmet(String p, int ETC){
        nazivPredmeta = p;
        ETCbodovi = ETC;
    }

    public static void upisiStudenta(String ime){
        studenti.add(new Student(ime, 3, 17322));
    }

    public static void ispisStudenata(String ime){
        for(Student s: studenti){
            studenti.remove(s);
        }
    }
    public Set<Student> spisakStudenata(){
        return studenti;
    }


    public String getNazivPredmeta(){
        return nazivPredmeta;
    }
    public void setNazivPredmeta(String predmet) {
        nazivPredmeta = predmet;
    }
    public int getETCbodovi(){
        return ETCbodovi;
    }
    public void setETCbodovi(int ETCbodovi){
        this.ETCbodovi = ETCbodovi;
    }
}
