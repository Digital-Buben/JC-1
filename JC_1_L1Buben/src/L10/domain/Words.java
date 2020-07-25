package L10.domain;

public class Words implements Composite {

    private String x;

    public static final String REGEXP_WORDS ="[\\w+,\\.-]+[^(,.!?\"\\(\\)\\s+)]";

    public Words(String x) {
        this.x = x;
    }

    public void addComponent(String string){
        x+=string;
    }

    public void addComponent(String string, int index){
        StringBuffer buffer = new StringBuffer(x);
        buffer.insert(string.length(), string, index, index + string.length());
        x = buffer.toString();
    }

    public void removeComponent(String string){
        x.replace(string, "");
    }

    public void removeComponent(int index){
        StringBuffer buffer = new StringBuffer(x);
        buffer.deleteCharAt(index);
        x = buffer.toString();
    }

    public String getComponent(int index){
        char[] c = new char[1];
        c[0] = x.charAt(index);

        return c.toString();
    }

    public void setComponent(int index, String string){
        StringBuffer buffer = new StringBuffer(x);
        for (int i = index; i <index+string.length() ; i++) {
            buffer.setCharAt(i,string.charAt(i-index));
        }
        x = buffer.toString();
    }

    @Override
    public String toString() {
        return x;
    }
}
