package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void bfs(Node node) {
        if (node == null) return;
        HashSet<Node> set = new HashSet<Node>();
        Queue<Node> queue = new LinkedList<Node>();

        set.add(node);
        queue.add(node);

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.println(cur.value);

            for (Node next : cur.nexts) {
                if (!set.contains(next)) {
                    queue.add(next);
                    set.add(next);
                }
            }

        }

    }
}
