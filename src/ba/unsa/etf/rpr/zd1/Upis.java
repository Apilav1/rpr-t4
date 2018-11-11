package ba.unsa.etf.rpr.zd1;

import java.util.Set;

public class Upis {
    private static Set<Student> studenti;
    private static Set<Predmet> predmeti;
    private static Set<PlanStudiranja> plan;

    public void upisStudenta(Student s, int sem, PlanStudiranja p){
        studenti.add(s);
    }
    public static Set<Predmet> spisakPredmetaZaStudenta(Student s){
        return predmeti;
    }
    public static Set<Student> dajSpisakStudenata(){
        return studenti;
    }
}
