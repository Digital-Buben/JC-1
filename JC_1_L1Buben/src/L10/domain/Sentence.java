package L10.domain;

import L10.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements Composite{
    private List<Composite> components = new ArrayList<>();

    public Sentence(List<Composite> components) {
        this.components = components;
    }

    public static final String REGEXP_WORDS_SIMBOLS ="[\\w+,\\.-]+[^(,.!?\"\\(\\)\\s+)]|[ ,\\.!?\\(\\)\"]";

    public void addComponent (String string){
        Composite text = (Composite) Util.WSParser(string);
        components.add(text);
    }

    public void addComponent (String string, int index){
        Composite text = (Composite) Util.WSParser(string);
        components.add(index, text);
    }

    public void removeComponent (String string){
        Composite text = (Composite) Util.WSParser(string);
        components.remove(text);
    }

    public void removeComponent (int index){
        components.remove(index);
    }

    public String getComponent (int index){
        return String.valueOf(components.get(index));
    }

    public void setComponent (int index, String string){
        Composite text = (Composite) Util.WSParser(string);
        components.set(index, text);
    }

    @Override
    public String toString() {
        return L10.util.ArrayList.toString(components);
    }
}
