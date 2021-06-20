public class Sheet implements ISell{

    private int buyingPrice;
    private int sellingPrice;

    public Sheet(int buyingPrice, int sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public int calculateMarkup() {
        return 0;
    }
}
