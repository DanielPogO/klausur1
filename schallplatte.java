public class schallplatte extends medium{
    boolean darfVerliehenWerden;

    public schallplatte(String titel, Integer fsk, Integer laenge) {
        super(titel, fsk, laenge);
        setDarfVerliehenWerden(darfVerliehenWerden);
    }

    public void zeigeMedien(){
        System.out.println(getTitel()+" "+getFsk()+" "+getLaenge());
    }

    public void setDarfVerliehenWerden(boolean darfVerliehenWerden) {
        this.darfVerliehenWerden = darfVerliehenWerden;
    }
    public boolean getDarfVerliehenWerden(){
        return darfVerliehenWerden;
    }

}
