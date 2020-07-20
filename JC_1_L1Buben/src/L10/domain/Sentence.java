package L10.domain;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements Composite{
    private List<Composite> components = new ArrayList<>();

    public static final String REGEXP_WORDS ="[\\w+,\\.-]+[^(,.\\s+)]";

    public void addComponent (Composite component){
        components.add(component);
    }

    public void addComponent (Composite component, int index){
        components.add(index, component);
    }

    public void removeComponent (Composite component){
        components.remove(component);
    }

    public void removeComponent (int index){
        components.remove(index);
    }

    public void getComponent (int index){
        components.get(index);
    }

    public void setComponent (int index, Composite component){
        components.set(index, component);
    }
}
