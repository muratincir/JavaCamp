package business.concretes;

import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import dataAccess.concretes.GoogleUserDao;
import entites.concretes.User;

import java.util.List;

public class GoogleUserManager implements UserService {
    private UserCheckService userCheckService;
    private GoogleUserDao googleUserDao;

    public GoogleUserManager(GoogleUserDao googleUserDao, UserCheckService userCheckService) {
        this.googleUserDao = googleUserDao;
        this.userCheckService = userCheckService;
    }

    @Override
    public void signUp(User user, List<User> userList) {

        if (userCheckService.checkUserInfo(user, userList)) {
            userList.add(user);
            googleUserDao.signUp(user, userList);
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
