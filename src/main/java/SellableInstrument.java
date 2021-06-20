public abstract class SellableInstrument {

    private String material;
    private String colour;
    private String type;
    private int buyingPrice;
    private int sellingPrice;

    public SellableInstrument(String material, String colour, String type, int buyingPrice, int sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
}
