package Test.JavaBasic;


public class JAVAPractice {

    public static void main(String[] args) throws Exception {


    }

    public static void login(String account, String password) {
        if (!"admin".equals(account)) {
            throw new AccountException("账号错误");
        }

        if (!"admin".equals(password)) {

            throw new AccountException("密码错误");
        }
    }

}

class AccountException extends LoginException {
    public AccountException(String message) {
        super(message);
    }
}

class PasswordException extends LoginException {
    public PasswordException(String message) {
        super(message);
    }
}

class LoginException extends RuntimeException {
    public LoginException(String message) {
        super(message);
    }
}