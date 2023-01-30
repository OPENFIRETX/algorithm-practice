package HashMapAndSortedMap;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapAndSortedMap {

    public static class Node {
        public int value;

        public Node(int v) {
            value = v;
        }
    }

    public static void main(String[] args) {
        HashMap<Node, String> map2 = new HashMap<>();

        Node node1 = new Node(1);
        Node node2 = new Node(2);

        map2.put(node1, "我是node1");
        map2.put(node2, "我是node2");

//        System.out.println(map2.size());
//        ===========================有序表

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1,"我是1");
        treeMap.put(2,"我是2");
        treeMap.put(3,"我是3");

    }

}
