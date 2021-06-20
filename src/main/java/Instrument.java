public abstract class Instrument {

    private String material;
    private String colour;
    private String type;


    public Instrument(String material, String colour, String type) {
        this.material = material;
        this.colour = colour;
        this.type = type;
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
}
