import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColorTemplates {

    Color template[];
    RGB templateRGB[];

    public ColorTemplates(int n) {
        template = new Color[n];
        templateRGB = new RGB[n];
    }

    public Color getColor(int i) {
        return template[i];
    }
    public void setColor(int i, Color color) {
        template[i] = color;
        templateRGB[i] = color.toRGB();
    }

    public Color find(Color color){
        int diff[] = new int[templateRGB.length];
        RGB current = color.toRGB();
        int minn=15000;
        int mini;
        if (diff.length!=0) mini=0;
        else return null;
        for (int i=0; i<templateRGB.length; i++) {
            diff[i] = current.metrics(templateRGB[i]);
            if (diff[i]<minn){
                minn=diff[i];
                mini=i;
            }
        }
        return template[mini];
    }
}
