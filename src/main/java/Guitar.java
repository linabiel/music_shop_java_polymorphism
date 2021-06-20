public class Guitar extends SellableInstrument implements IPlay, ISell{

    private int strings;


    public Guitar(String material, String colour, String type, double buyingPrice, double sellingPrice, int strings) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String play(String sound) {
        return "playing " + sound;
    }

}
