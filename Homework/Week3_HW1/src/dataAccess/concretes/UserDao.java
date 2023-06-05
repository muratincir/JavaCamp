package dataAccess.concretes;

import dataAccess.abstracts.UserDaoManager;
import entites.concretes.User;

import java.util.List;

public class UserDao implements UserDaoManager {
    @Override
    public void signUp(User user, List<User> userList) {
        System.out.println(user.getFirstName()+" Signing up is successful");
    }

    @Override
    public void signIn(User user, List<User> userList) {

    }
}
