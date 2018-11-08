package ba.unsa.etf.rpr.zd1;

public class ObavezniPredmet extends Predmet{
    Student[] nizStudenata;
    int zaSemestar;
    public ObavezniPredmet(){}

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public int getZaSemestar(){return zaSemestar;}
    public void setZaSemestar(int semestar){zaSemestar = semestar;}
}
