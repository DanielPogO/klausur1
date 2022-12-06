public class DVD extends medium{
    boolean fullHD;

    public DVD(String titel, Integer fsk, Integer laenge, boolean fullHD) {
        super(titel, fsk, laenge);
        setFullHD(fullHD);
    }

    public void zeigeMedien(){
        System.out.println(getTitel()+" "+getFsk()+" "+getLaenge());
    }

    public void setFullHD(boolean fullHD) {
        this.fullHD = fullHD;
    }
    public boolean getFullHD(){
        return fullHD;
    }

}
