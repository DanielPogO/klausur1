public class kunde {
    Integer kundennummer;
    String vorname;
    String nachname;
    Integer alter;

    public kunde(Integer kundennummer, String vorname, String nachname, Integer alter){
        setKundennummer(kundennummer);
        setVorname(vorname);
        setNachname(nachname);
        setAlter(alter);
    }
    
    public void setKundennummer(Integer kundennummer) {
        this.kundennummer = kundennummer;
    }
    public Integer getKundennummer() {
        return kundennummer;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getVorname() {
        return vorname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setAlter(Integer alter) {
        this.alter = alter;
    }
    public Integer getAlter() {
        return alter;
    }

}
