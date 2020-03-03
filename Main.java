

public class Main {
    public static void main(String[] args) {
        Color color[] = new Color[5];
        color[0] = new Grayscale(1);
        color[1] = new RGB(220, 20, 60);
        color[2] = new HSV(120, 33, 37);
        color[3] = new RGB(75,0,130);
        color[4] = new HSV(350, 90, 52);
        System.out.println(Integer.toHexString(color[1].packRGB()));
        System.out.println(Integer.toHexString(color[3].packRGB()));

        ColorTemplates temp = new ColorTemplates(2);
        temp.setColor(0, new RGB(220, 20, 60));
        temp.setColor(1, new RGB(0, 20, 0));
        System.out.println((temp.find(new RGB(210, 0, 50))).packRGB());
    }
}
