public class Piano extends SellableInstrument implements IPlay, ISell{

    private int keys;


    public Piano(String material, String colour, String type, double buyingPrice, double sellingPrice, int keys) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public String play(String sound) {
        return "playing" + sound;
    }

//    public double calculateMarkup() {
//        double markup = getBuyingPrice() * 0.2;
//        return markup;
//    }

}
