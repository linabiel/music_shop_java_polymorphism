public class Piano extends SellableInstrument implements IPlay, ISell{

    private String keys;


    public Piano(String material, String colour, String type, int buyingPrice, int sellingPrice, String keys) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.keys = keys;
    }

    public String play(String sound) {
        return "playing" + sound;
    }


    @Override
    public int calculateMarkup() {
        return 0;
    }
}
