package L10.domain;

public class Simbols implements Composite {
    private String x;

    public Simbols (String x) {
        this.x = x;
    }

    public void addComponent(String i){
        this.x = i;
    }

    public void addComponent(String string, int index){
        this.x = string;
    }

    public String getComponent(int index) {
        return x;
    }

    public void setComponent(int index,String x) {
        this.x = x;
    }

    public void removeComponent(String string){
        x.replace(string, "");
    }

    public void removeComponent(int index){
        StringBuffer buffer = new StringBuffer(x);
        buffer.deleteCharAt(index);
        x = buffer.toString();
    }

    @Override
    public String toString() {
        return x;
    }
}
