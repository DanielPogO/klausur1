import java.util.ArrayList;

public class App {
    static ArrayList<medium> medien;
    public static void main(String[] args) throws Exception {
        setMedien(new ArrayList<medium>());
        zeigeMedien();

    }
    public static void zeigeMedien(){
        int i=1;
        for(medium medium : getMedien()){
            System.out.print(i + ". ");
            medium.zeigeMedien();
            i++;
        }
    }

    public static void setMedien(ArrayList<medium> medien) {
        App.medien = medien;
    }
    public static ArrayList<medium> getMedien() {
        return medien;
    }
}
