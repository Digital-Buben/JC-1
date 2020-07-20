package L8;

import L8.domain.Human;
import L8.util.FriendsUtil;
import L8.util.HumanUtil;

public class DemoFriends {
    public static void main(String[] args) {
        Human human = HumanUtil.generateHuman();
        FriendsUtil.friendsGenerator(human, 5);

    }
}
