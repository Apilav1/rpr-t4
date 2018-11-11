package ba.unsa.etf.rpr.zd1;

public class ObavezniPredmet extends Predmet{
    Student[] nizStudenata;
    String naziv;
    int zaSemestar;
    int etc;
    public ObavezniPredmet(String p, int etcc){
        super(p, etcc);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public int getZaSemestar(){
        return zaSemestar;
    }
    public void setZaSemestar(int semestar){
        zaSemestar = semestar;
    }
}
