package L8.domain;

import java.util.LinkedList;

public class FriendList {
    private Human friensOwner;

    private LinkedList<Human> friends;

    public FriendList(Human friensOwner, LinkedList<Human> friends) {
        this.friensOwner = friensOwner;
        this.friends = friends;
    }

    public FriendList() {
    }

    public Human getFriensOwner() {
        return friensOwner;
    }

    public void setFriensOwner(Human friensOwner) {
        this.friensOwner = friensOwner;
    }

    public LinkedList<Human> getFriends() {
        return friends;
    }

    public void setFriends(LinkedList<Human> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "FriendList{" +
                "friensOwner = [[[" + friensOwner  +
                "]]], friends = {{{" + friends +
                "}}}                                                                              ";
    }
}
