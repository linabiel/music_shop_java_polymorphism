public abstract class SellableInstrument implements ISell {

    private String material;
    private String colour;
    private String type;
    private double buyingPrice;
    private double sellingPrice;

    public SellableInstrument(String material, String colour, String type, double buyingPrice, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice() {
        this.sellingPrice = getBuyingPrice() + calculateMarkup();
    }

    public double calculateMarkup() {
        double markup = getBuyingPrice() * 0.2;
        return markup;
    }

}
