import java.util.ArrayList;

public class Stock {

    private ArrayList<ISell> pianos;
    private ArrayList<ISell> guitars;

    public Stock() {
        this.pianos = new ArrayList<>();
        this.guitars = new ArrayList<>();
    }

    public ArrayList<ISell> getPianos() {
        return pianos;
    }

    public String getPianoType() {
        for (ISell piano : pianos) {
            return piano.getType();
        }
        return "No pianos are in stock atm";
    }

    public String searchPianoByType(ISell piano) {
        if (pianos.contains(piano)) {
             return piano.getType();
        }
        return "Type not in stock";
    }

    public void addPianoToStock(Piano piano) {
        this.pianos.add(piano);
    }

    public void removePianoFromStock(Piano piano) {
        this.pianos.remove(piano);
    }

    public ArrayList<ISell> getGuitars() {
        return guitars;
    }

    public void addGuitarToStock(Guitar guitar) {
        this.guitars.add(guitar);
    }


    public int getPianoStockSize() {
        return pianos.size();
    }
}
