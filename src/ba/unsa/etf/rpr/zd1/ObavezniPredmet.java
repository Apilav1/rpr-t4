package ba.unsa.etf.rpr.zd1;

public class ObavezniPredmet extends Predmet{
    Student[] nizStudenata;
    int zaSemestar;
    public ObavezniPredmet(){}

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    public void upisiStudenta(String ime){}
    public void ispisStudenata(){}
    public int getZaSemestar(){return zaSemestar;}
    public void setZaSemestar(int semestar){this.zaSemestar = semestar;}
    public void obrisiStudenta(Student naziv){}
}
