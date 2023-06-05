package business.abstracts;

import entites.concretes.User;

import java.util.List;

public interface UserCheckService {
    boolean checkUserInfo(User user, List<User> userList);
    boolean isEmailVerified(User user, List<User> userList);
    boolean validateEmail(User user);
    boolean isEmailUnique(User user, List<User> userList);
}
