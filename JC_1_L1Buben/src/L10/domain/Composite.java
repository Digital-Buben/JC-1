package L10.domain;

public interface Composite{
    public String getComponent (int index);
    public void addComponent (String string);
    public void setComponent (int index, String string);
    public void removeComponent (int index);
    public void addComponent (String string, int index);
    public void removeComponent (String string);


}
