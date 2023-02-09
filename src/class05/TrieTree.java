package class05;

import java.util.Arrays;

public class TrieTree {

    public static class Node1 {
        public int pass;
        public int end;
        public Node1[] nexts;

        public Node1() {
            pass = 0;
            end = 0;
            nexts = new Node1[26];
        }
    }

    public static class Trie1 {
        private Node1 root;

        public Trie1() {
            root = new Node1();
        }

        public void insert(String value) {
            if (value == null) return;
            char[] strs = value.toCharArray();
            Node1 node = root;
            node.pass++;

            int path = 0;
            for (int i = 0; i < strs.length; i++) {
                path = strs[i] - 'a'; //字符ASC码相减
                if (node.nexts[path] == null) {
                    node.nexts[path] = new Node1();
                }
                node = node.nexts[path];
                node.pass++;

            }
            node.end++;
        }

        public int search(String value) {
            if (value == null) return 0;
            Node1 nodePointer = root;
            char[] strs = value.toCharArray();
            int path;
            for (int i = 0; i < strs.length; i++) {
                path = strs[i] - 'a';

                if (nodePointer.nexts[path] == null) {
                    return 0;
                }
                nodePointer = nodePointer.nexts[path];

            }
            return nodePointer.end;
        }


        //        所有加入的字符串中，有几个是以pre这个字符串作为前缀的
        public int prefixNumber(String pre) {
            if (pre == null) return 0;
            char[] str = pre.toCharArray();
            Node1 node = root;
            int index = 0;
            for (int i = 0; i < str.length; i++) {
                index = str[i] - 'a';
                if (node.nexts[index] == null) {
                    return 0;
                }
                node = node.nexts[index];
            }
            return node.pass;
        }

        public void delete(String value) {
            if (search(value) != 0) {
                char[] str = value.toCharArray();
                int path;
                Node1 nodePointer = root;
                nodePointer.pass--;
                for (int i = 0; i < str.length; i++) {
                    path = str[i] - 'a';
                    if (--nodePointer.nexts[path].pass == 0) {
                         nodePointer.nexts[path] = null;
                        return;
                    }
                    nodePointer = nodePointer.nexts[path];
                }
                nodePointer.end--;

            }
        }

    }

    public static void main(String[] args) {
        Trie1 trieTree = new Trie1();
        trieTree.insert("abc");
        trieTree.insert("adb");
        trieTree.insert("ags");
        trieTree.insert("ead");
        trieTree.insert("abcfs");
        System.out.println(trieTree.root.pass);
        System.out.println(trieTree.search("abc"));
        System.out.println(trieTree.prefixNumber("abc"));

    }
}
