public class RGB extends Color {
    int r;
    int g;
    int b;

    public RGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public int packRGB() {
        return r*65536+g*256+b;
    }

    @Override
    public RGB toRGB() {
        return this;
    }

    public int metrics(RGB colour){
        return (colour.r-r)*(colour.r-r)+(b-colour.b)*(b-colour.b)+(g-colour.g)*(g-colour.g);
    }
}
