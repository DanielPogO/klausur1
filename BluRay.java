public class BluRay extends medium{
    boolean dreidimensional;

    public BluRay(String titel, Integer fsk, Integer laenge, boolean dreidimensional) {
        super(titel, fsk, laenge);
        setDreidimensional(dreidimensional);
    }
    
    public void zeigeMedien(){
        System.out.println(getTitel()+" "+getFsk()+" "+getLaenge());
    }

    public void setDreidimensional(boolean dreidimensional) {
        this.dreidimensional = dreidimensional;
    }
    public boolean getDreidimensional(){
        return dreidimensional;
    }

}
