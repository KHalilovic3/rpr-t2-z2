package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetna;
    private double  kraj;
    private boolean PripadaPoc;
    private boolean PripadaKraj;

    public double getPocetna() {
        return pocetna;
    }

    public void setPocetna(double pocetna) {
        this.pocetna = pocetna;
    }

    public double getKraj() {
        return kraj;
    }

    public void setKraj(double kraj) {
        this.kraj = kraj;
    }

    public boolean isPripadaPoc() {
        return PripadaPoc;
    }

    public void setPripadaPoc(boolean pripadaPoc) {
        PripadaPoc = pripadaPoc;
    }

    public boolean isPripadaKraj() {
        return PripadaKraj;
    }

    public void setPripadaKraj(boolean pripadaKraj) {
        PripadaKraj = pripadaKraj;
    }



    public Interval(double p,double k,boolean PP,boolean PK){
        try {
            if (p > k) {
                throw new IllegalArgumentException("Neispravno");
            }
            this.pocetna = p;
            this.kraj = k;
            this.PripadaPoc = PP;
            this.PripadaKraj = PK;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public Interval(){
        this.pocetna = 0;
        this.kraj = 0;
        this.PripadaKraj = false;
        this.PripadaPoc = false;
    }

    final boolean isNull(){
        if(this.getPocetna() == 0 && this.getKraj() == 0 && !this.isPripadaKraj() && !this.isPripadaPoc()){
            return true;
        }else{
            return false;
        }
    }
    final boolean isIn(double a){
        if(a >= this.getPocetna() && a <= this.getKraj()){
            return true;
        }else{
            return false;
        }
    }
    final Interval intersect (Interval a){

    }
    static Interval intersect (Interval a,Interval b){
        Interval temp = new Interval();
        if(a.getPocetna() > b.getPocetna()){
            temp.setPocetna(a.getPocetna());
            temp.setPripadaPoc(a.isPripadaPoc());
        }else if(a.getPocetna() < b.getPocetna()){
            temp.setPocetna(b.getPocetna());
            temp.setPripadaPoc(b.isPripadaPoc());
        }else{
            temp.setPocetna(b.getPocetna());
            if(a.isPripadaPoc() == false){
                temp.setPripadaPoc(false);
            }else if(b.isPripadaPoc() == false){
                temp.setPripadaPoc(false);
            }else{
                temp.setPripadaPoc(true);
            }
        }
    @Override
    public String toString(){

    }

}
