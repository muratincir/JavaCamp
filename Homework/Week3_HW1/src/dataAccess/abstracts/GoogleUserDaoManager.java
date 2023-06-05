package dataAccess.abstracts;

import entites.concretes.User;

import java.util.List;

public interface GoogleUserDaoManager {
    void signUp(User user, List<User> userList);
    void signIn(User user, List<User> userList);
}
