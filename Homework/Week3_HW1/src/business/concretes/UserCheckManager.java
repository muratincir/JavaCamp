package business.concretes;

import business.abstracts.UserCheckService;
import entites.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {
    // REGEX string ifadelerin birbirleri ile eşleşmesinde kullanılan bir sınıftır
    private Pattern pattern; // Hız için ilk başta Pattern olayı yapılır. (Düzen) Daha sonra Compile ve en son da matcher
    private Matcher matcher; // Eşleştirme
    private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @Override
    public boolean checkUserInfo(User user, List<User> userList) {
        if (user.getFirstName() != null && user.getLastName() != null && user.getEmail() != null && user.getPassword() != null) {
            if (user.getPassword().length() >= 6) {
                if (validateEmail(user)) {
                    if (isEmailUnique(user, userList)) {
                        if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {
                            if (isEmailVerified(user, userList)) {
                                return true;
                            }
                        } else {
                            System.out.println("Adınız ve Soyadınız en az 2 karakterden oluşmalıdır !!!");
                            return false;
                        }
                    } else {
                        System.out.println("Email daha önce kullanılmış !!!");
                        return false;
                    }
                } else {
                    System.out.println("Geçersiz e-mail !!!");
                    return false;
                }
            } else {
                System.out.println("Şifreniz en az 6 karakterden oluşmalıdır !!!");
                return false;
            }
        } else {
            System.out.println("Bilgiler eksik girilmiştir !!!");
            return false;
        }
        return false;
    }

    @Override
    public boolean isEmailVerified(User user, List<User> userList) {
        if (true) {
            return true;
        } else
            return false;
    }

    @Override
    public boolean validateEmail(User user) {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(user.getEmail());
        return matcher.matches();
    }

    @Override
    public boolean isEmailUnique(User user, List<User> userList) {
        boolean checkEmail = true;
        for (int i = 0; i < userList.size(); i++) {

            if (userList.get(i).getEmail().equals(user.getEmail())) {
                checkEmail = false;
            }
        }
        if (checkEmail) {
            return true;
        } else
            return false;
    }
}
