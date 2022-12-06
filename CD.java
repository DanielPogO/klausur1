public class CD extends medium{
    boolean sp;
    boolean lp;

    public CD(String titel, Integer fsk, Integer laenge) {
        super(titel, fsk, laenge);
        setSp(sp);
        setLp(lp);
    }

    public void zeigeMedien(){
        System.out.println(getTitel()+" "+getFsk()+" "+getLaenge());
    }

    public void setLp(boolean lp) {
        this.lp = lp;
    }
    public boolean getLp(){
        return lp;
    }
    public void setSp(boolean sp) {
        this.sp = sp;
    }
    public boolean getSp(){
        return sp;
    }

}
