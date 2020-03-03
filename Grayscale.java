public class Grayscale extends Color {
    int grey;

    public Grayscale(int grey) {
        this.grey = grey;
    }

    @Override
    public int packRGB() {
        int rgb = grey * 0x00010101;
        return rgb;
    }
    @Override
    public RGB toRGB() {
        return new RGB(grey, grey, grey);
    }

}
