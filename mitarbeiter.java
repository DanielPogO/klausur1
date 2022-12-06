public class mitarbeiter {
    Integer mitarbeiternummer;
    String vorname;
    String nachname;

    public mitarbeiter(Integer mitarbeiternummer, String vorname, String nachname){

    }

    public void setMitarbeiternummer(Integer mitarbeiternummer) {
        this.mitarbeiternummer = mitarbeiternummer;
    }
    public Integer getMitarbeiternummer() {
        return mitarbeiternummer;
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
}
