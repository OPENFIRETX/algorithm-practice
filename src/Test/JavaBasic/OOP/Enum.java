package Test.JavaBasic.OOP;

public class Enum {

    public static void main(String[] args) {
        System.out.println(City.SHANGHAI.name);
    }

}


enum City {
    SHANGHAI("背景", 1001), BEIJING("上海", 1002);

    City(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String name;
    public int code;
}