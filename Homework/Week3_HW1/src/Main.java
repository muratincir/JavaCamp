import business.abstracts.UserService;
import business.concretes.GoogleUserManager;
import business.concretes.UserCheckManager;
import dataAccess.concretes.GoogleUserDao;
import entites.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> userList = new ArrayList<>();
        UserService userService = new GoogleUserManager(new GoogleUserDao(),new UserCheckManager());
        User user1 = new User("Murat","İncir","murattincirr34@gmail.com","123456");
        User user2 = new User("Engin","Demiroğ","engindemirog@gmail.com","654321");
        userService.signUp(user1,userList);
        userService.signUp(user2,userList);

        //**********************************************//

        System.out.println("Your e-mail : ");
        String email = scanner.nextLine();
        System.out.println("Your password : ");
        String password = scanner.nextLine();
        userService.signIn(email,password,userList);

    }
}