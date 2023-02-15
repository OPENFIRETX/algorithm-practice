package Test.JavaBasic.Gather;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

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

class Queue {
    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
    }
}

class Map {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("a", "b");
        System.out.println(map);


    }
}

class Hashtable {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        //keyset 获取所有键名
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        //keys.iterator 获取keys 迭代器
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            if ("b".equals(key)) {
                iterator.remove();
            }
            System.out.println(key);
        }

    }
}

class Utils {
    public static void main(String[] args) {
//        Arrays
        int[] is = {1, 2, 3, 5, 4, 8};

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);



    }

}