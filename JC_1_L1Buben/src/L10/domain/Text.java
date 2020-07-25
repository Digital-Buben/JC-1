package L10.domain;

import L10.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Text implements Composite {
    private List<Composite> components = new ArrayList<>();

    public Text(List<Composite> components) {
        this.components = components;
    }

    public static final String REGEXP_PARAGRAPHS ="((.+)\\n)+";

    public void addComponent (String string){
        Paragraph text = new Paragraph(Util.paragraphParser(string));
        components.add(text);
    }

    public void addComponent (String string, int index){
        Paragraph text = new Paragraph(Util.paragraphParser(string));
        components.add(index, text);
    }

    public void removeComponent (String string){
        Paragraph text = new Paragraph(Util.paragraphParser(string));
        components.remove(text);
    }

    public void removeComponent (int index){
        components.remove(index);
    }

    public String getComponent (int index){
       return String.valueOf(components.get(index));
    }

    public void setComponent (int index, String string){
        Paragraph text = new Paragraph(Util.paragraphParser(string));
        components.set(index, text);
    }

    @Override
    public String toString() {
        return L10.util.ArrayList.toString(components);
    }
}
