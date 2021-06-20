public class Cello extends Instrument implements IPlay, ISell {

    public Cello(String material, String colour, String type) {
        super(material, colour, type);
    }

    public String play(String sound) {
        return "playing" + sound;
    }

    public int calculateMarkup() {
        return 0;
    }
}
