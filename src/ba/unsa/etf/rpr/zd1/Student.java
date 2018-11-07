package ba.unsa.etf.rpr.zd1;

public class Student {
    String naziv;
    int semestar;
    Predmet[] predmeti;
    public Student(String naziv, int semestar){}
    public Predmet[] getPredmet(){return predmeti;}
    public void setPretmet(Predmet p){}
    public String getNaziv(){return naziv;}
    public void setNaziv(String naziv){this.naziv = naziv;}
    public int getSemestar(){return semestar;}
    public void setSemestar(int semestar){this.semestar=semestar;}
}
