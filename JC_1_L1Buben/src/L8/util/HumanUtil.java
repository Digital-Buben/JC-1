package L8.util;

import L8.domain.Human;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HumanUtil {
    public static Human generateHuman() {
        File names = new File("src/resources/Names");
        List<String> namesList = null;
        try {
            namesList = Files.readAllLines(Paths.get("src/resources/Names"));
        } catch (IOException i) {
            i.printStackTrace();
        }

        int namesLength = namesList.size();
        File patronym = new File("src/resources/Patronym");
        try {
            namesList = Files.readAllLines(Paths.get("src/resources/Patronym"));
        } catch (IOException i) {
            i.printStackTrace();
        }
        int patronymLength = namesList.size();
        File surname = new File("src/resources/Surname");
        try {
            namesList = Files.readAllLines(Paths.get("src/resources/Surname"));
        } catch (IOException i) {
            i.printStackTrace();
        }
        int surnameLength = namesList.size();
        namesList = null;
        Scanner scanner = null;
        try {
            scanner = new Scanner(names);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(patronym);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(surname);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Human human = new Human();

        int randomName = (int) (Math.random() * (namesLength - 1) + 1);
        int randomPatronym = (int) (Math.random() * (patronymLength - 1) + 1);
        int randomSurname = (int) (Math.random() * (surnameLength - 1) + 1);


        for (int i = 0; i < randomName; i++) {
            String line = scanner.nextLine();
            if (i == randomName - 1) {
                human.setHumanName(line);
            }
        }
        scanner.close();

        for (int i = 0; i < randomPatronym; i++) {
            String line = scanner1.nextLine();
            if (i == randomPatronym - 1) {
                human.setHumanPatronym(line);
            }

        }
        scanner1.close();

        for (int i = 0; i < randomSurname; i++) {
            String line = scanner2.nextLine();
            if (i == randomSurname - 1) {
                human.setHumanSurname(line);
            }
        }

        scanner2.close();
        return human;
    }

    public static LinkedList<Human> generateHumans(int numberOfHumans) {
        LinkedList<Human> humans = new LinkedList<Human>();
        for (int i = 0; i < numberOfHumans ; i++) {
            humans.add(generateHuman());
        }
        return humans;
    }
}
