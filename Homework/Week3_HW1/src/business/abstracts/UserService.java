package business.abstracts;

import entites.concretes.User;

import java.util.List;

public interface UserService {
    void signUp(User user, List<User> userList);
    void signIn(String email, String password, List<User> userList);
}
