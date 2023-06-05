package dataAccess.concretes;

import dataAccess.abstracts.GoogleUserDaoManager;
import entites.concretes.User;

import java.util.List;

public class GoogleUserDao implements GoogleUserDaoManager {

    @Override
    public void signUp(User user, List<User> userList) {
        System.out.println(user.getFirstName()+" Signing up is successful with Google account");
    }

    @Override
    public void signIn(User user, List<User> userList) {}

}
