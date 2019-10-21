package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetna;
    private double  kraj;
    private boolean PripadaPoc;
    private boolean PripadaKraj;

    public Interval(double p,double k,boolean PP,boolean PK){
        try {
            if (p > k) {
                throw new IllegalArgumentException("Neispravno");
            }
            pocetna = p;
            kraj = k;
            PripadaPoc = PP;
            PripadaKraj = PK;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public Interval(){
        pocetna = 0;
        kraj = 0;
        PripadaKraj = false;
        PripadaPoc = false;
    }

    final boolean isNull(){
        if(pocetna == 0 && kraj == 0 && !PripadaPoc && !PripadaKraj){
            return true;
        }else{
            return false;
        }
    }
    final boolean isIn(double a){
        if(a >= pocetna && a <= kraj){
            return true;
        }else{
            return false;
        }
    }
    final Interval intersect (Interval a){

    }
    static Interval intersect (Interval a,Interval b){

    }
    @Override
    public String toString()

}
