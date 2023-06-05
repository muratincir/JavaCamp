package business.concretes;

import business.abstracts.UserService;
import dataAccess.concretes.UserDao;
import entites.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    private UserCheckManager userCheckManager;
    private UserDao userDao;

    public UserManager(UserCheckManager userCheckManager, UserDao userDao) {
        this.userCheckManager = userCheckManager;
        this.userDao = userDao;
    }

    @Override
    public void signUp(User user, List<User> userList) {
        if (userCheckManager.checkUserInfo(user, userList)) {
            userList.add(user);
            userDao.signUp(user, userList);
        }
    }

    @Override
    public void signIn(String email, String password, List<User> userList) {
        boolean checkSign = false;
        for (int i = 0; i < userList.size(); i++) {

            if (userList.get(i).getEmail().equals(email) && userList.get(i).getPassword().equals(password)) {
                System.out.println("Login successful");
                checkSign = true;
            }
        }

        if (!checkSign) {
            System.out.println("Email or password is incorrect!");
        }

    }
}

