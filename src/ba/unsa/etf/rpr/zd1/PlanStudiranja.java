package ba.unsa.etf.rpr.zd1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlanStudiranja {
    Map<Integer, Set<Predmet>> semestri = new HashMap<>();

    public void dodajSemestarAkoNePostoji(Integer sem, HashMap<Integer,Set<Predmet>> predmeti){
        if(!semestri.containsKey(sem))

            semestri.entrySet().add((Map.Entry<Integer, Set<Predmet>>) predmeti);

    }
    public void ispitiPredmeteZaSemestar(Integer sem){
        for(HashMap.Entry<Integer, Set<Predmet>> p : semestri.entrySet()){
            System.out.println(String.valueOf(p.getValue().getClass().toString()));
        }
    }
}
