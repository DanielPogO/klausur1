public class medium {
    String titel;
    Integer fsk;
    Integer laenge; //In Minuten

    public medium(String titel, Integer fsk, Integer laenge){
        setTitel(titel);
        setFsk(fsk);
        setLaenge(laenge);
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
    public String getTitel() {
        return titel;
    }
    public void setFsk(Integer fsk) {
        this.fsk = fsk;
    }
    public Integer getFsk() {
        return fsk;
    }
    public void setLaenge(Integer laenge) {
        this.laenge = laenge;
    }
    public Integer getLaenge() {
        return laenge;
    }

}
