public class Guitar extends SellableInstrument implements IPlay, ISell{

    private int strings;


    public Guitar(String material, String colour, String type, int buyingPrice, int sellingPrice, int strings) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.strings = strings;
    }

    public String play(String sound) {
        return "playing" + sound;
    }

    public int calculateMarkup() {
        return 0;
    }
}
