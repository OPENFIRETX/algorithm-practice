package Test.JavaBasic.Gather;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class Collection {

    public static void main(String[] args) {

//        ArrayList list = new ArrayList();
//        list.add("ronaldo");
//        list.add("aronaldo");
//        list.add("bronaldo");
//
//        list.get(1);
//        list.set(1,"ssss");
//        list.remove(2);


//        LinkedList list = new LinkedList();
//        list.add(1);
//        list.remove(2);

//        MyContainer<User> my = new MyContainer();

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(5);

        list.sort(new NumberComparator());
    }

}

class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
