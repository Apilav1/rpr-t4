package ba.unsa.etf.rpr.zd1;

public class IzborniPredmet {
    Student[] nizStudenata;
    int zaSemestar;
    public IzborniPredmet(){}

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
