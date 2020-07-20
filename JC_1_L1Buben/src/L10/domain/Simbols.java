package L10.domain;

public class Simbols implements Composite {
    private char x;

    public Simbols(char x) {
        this.x = x;
    }

    public void addComponent (char i){
        this.x = i;
    }

    public String string(){
        String string = null;
        string = string.valueOf(x);
        return string;
    }

    @Override
    public String toString() {
        return string();
    }
}
