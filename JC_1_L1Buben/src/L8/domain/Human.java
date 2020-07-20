package L8.domain;

import java.util.Objects;

public class Human{
    private String humanName;

    private String humanPatronym;

    private String humanSurname;

    public Human(String humanName, String humanPatronym, String humanSurnamem) {
        this.humanName = humanName;
        this.humanPatronym = humanPatronym;
        this.humanSurname = humanSurnamem;
    }

    public Human() {
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getHumanPatronym() {
        return humanPatronym;
    }

    public void setHumanPatronym(String humanPatronym) {
        this.humanPatronym = humanPatronym;
    }

    public String getHumanSurname() {
        return humanSurname;
    }

    public void setHumanSurname(String humanSurname) {
        this.humanSurname = humanSurname;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getHumanName().equals(human.getHumanName()) &&
                getHumanPatronym().equals(human.getHumanPatronym()) &&
                getHumanSurname().equals(human.getHumanSurname());
    }

    @Override
    public int hashCode() {
        return 31*Objects.hash(getHumanName(), getHumanPatronym(), getHumanSurname());
    }

    @Override
    public String toString() {
        return "Human{" +
                "humanName='" + humanName + '\'' +
                ", humanPatronym='" + humanPatronym + '\'' +
                ", humanSurname='" + humanSurname + '\'' +
                '}';
    }


}
