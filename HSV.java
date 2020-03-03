public class HSV extends Color {
    int hue; // 0, 360
    int saturation; // 0, 100
    int value; // 0, 100

    public HSV(int hue, int saturation, int value) {
        this.hue = hue;
        this.saturation = saturation;
        this.value = value;
    }

    @Override
    public int packRGB() {
        int hi = (int) Math.floor(hue/60.0)%6;
        double vmin = ((100-saturation)*value)/100.0;
        double a = (value-vmin)*(hue%60)/60.0;
        double vinc = vmin+a;
        double vdec = value-a;
        vmin = vmin*255/100;
        vinc = vinc*255/100;
        vdec = vdec*255/100;

        switch (hi){
            case 0:
                return value*65536+((int) vinc)*256+((int)vmin);
            case 1:
                return ((int)vdec)*65536+((int) value)*256+((int)vmin);
            case 2:
                return ((int)vmin)*65536+((int) value)*256+((int)vinc);
            case 3:
                return ((int)vmin)*65536+((int) vdec)*256+((int)value);
            case 4:
                return ((int)vinc)*65536+((int) vmin)*256+((int)value);
            case 5:
                return ((int)value)*65536+((int) vmin)*256+((int)vdec);
        }
        throw new IllegalArgumentException();
    }
}
