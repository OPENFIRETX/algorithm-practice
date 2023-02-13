package Test.JavaBasic.OOP;

public class Singleton {

    public static void main(String[] args) {

    }

}


class User {

    private static User user = null;

    private User() {

    }

    public static User getInstance() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

}

