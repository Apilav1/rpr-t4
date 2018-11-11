package ba.unsa.etf.rpr.zd1;

public class IzborniPredmet extends Predmet{
    Student[] nizStudenata;

    public IzborniPredmet(String p, int etcc){
        super(p, etcc);
    }
    int zaSemestar;
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    public int getZaSemestar(){
        return zaSemestar;
    }
    public void setZaSemestar(int semestar){
        this.zaSemestar = semestar;
    }
}
