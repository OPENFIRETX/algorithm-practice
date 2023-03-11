package UnionFind;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class UnionFind {

    public static class Node<V> {
        V value;

        public Node(V value) {
            this.value = value;
        }
    }

    public static class UnionSet<V> {


        public HashMap<V, Node<V>> nodes;

        public HashMap<Node<V>, Node<V>> parents;

        public HashMap<Node<V>, Integer> sizeMap;

        public UnionSet(List<V> values) {
            for (V cur : values) {
                Node<V> node = new Node<V>(cur);
                nodes.put(cur, node);
                parents.put(node, node);
                sizeMap.put(node, 1);
            }
        }

        public boolean isSameSet(V a, V b) {
            if (!nodes.containsKey(a) || !nodes.containsKey(b)) {
                return false;
            }
            return findFather(nodes.get(a)) == findFather(nodes.get(b));
        }

        public Node<V> findFather(Node<V> cur) {
            Stack<Node<V>> path = new Stack<>();
            while (cur != parents.get(cur)) {
                path.push(cur);
                cur = parents.get(cur);
            }
            while (!path.isEmpty()) {
                parents.put(path.pop(), cur);
            }
            return cur;
        }

        public void union(V a, V b) {
            if (!nodes.containsKey(a) || !nodes.containsKey(b)) {
                return;
            }
            Node<V> aHead = findFather(nodes.get(a));
            Node<V> bHead = findFather(nodes.get(b));
            if (aHead != bHead) {
                int aSetSize = sizeMap.get(aHead);
                int bSetSize = sizeMap.get(bHead);
                if (aSetSize <= bSetSize) {
                    parents.put(aHead, bHead);
                    sizeMap.put(bHead, bSetSize + aSetSize);
                    sizeMap.remove(aHead);
                } else {
                    parents.put(bHead, aHead);
                    sizeMap.put(aHead, aSetSize + bSetSize);
                    sizeMap.remove(bHead);
                }
            }
        }

    }

}
