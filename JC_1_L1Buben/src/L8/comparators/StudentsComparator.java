package L8.comparators;

import L8.domain.Human;

import java.util.Comparator;

public class StudentsComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return (o1.getHumanSurname().compareTo(o2.getHumanSurname()));
    }

}
