package L8.util;

import L8.domain.FriendList;
import L8.domain.Human;

import java.util.LinkedList;
import java.util.Random;

public class FriendsUtil {
    public static void friendsGenerator(Human human, int counter){
        if(counter == 0) return;
        LinkedList<Human> friends = new LinkedList<>();
        int friendsNumber = new Random().nextInt(3)+1;
        for (int i = 0; i < friendsNumber ; i++) {
            friends.add(i, HumanUtil.generateHuman());
        }
        FriendList friendList = new FriendList(human, friends);

        System.out.println("||||" + counter + "||||" + friendList + "||||" + counter + "||||");
        for (int i = 0; i < friendsNumber ; i++) {
            friendsGenerator(friendList.getFriends().get(i), counter-1);
        }
    }


}
