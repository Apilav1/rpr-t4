package ba.unsa.etf.rpr.zd1;

import java.util.Set;

public class Student {
    String naziv;
    int semestar, index;
    Predmet[] predmeti;
    public Student(String naziv, int semestar, int index){
        this.naziv = naziv;
        this.semestar = semestar;
        this.index = index;
    }
    public Predmet[] getPredmet(){
        return predmeti;
    }

    public String getNaziv(){
        return naziv;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public int getSemestar(){
        return semestar;
    }

    public void setSemestar(int semestar){
        this.semestar=semestar;
    }

    public Set<Predmet> dajPredmeteStudenta(){
        return Upis.spisakPredmetaZaStudenta(this);
    }

    public void setIndex(int index){
        this.index = index;
    }

    public int getIndex(){
        return index;
    }
}
