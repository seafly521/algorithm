package com.algorithm.queue;

import com.algorithm.struct.Node;

import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public int bfs(Node root, int target) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        int step = 0;

        while (queue.size() > 0) {
            step++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node curNode = queue.poll();
                System.out.println("value:" + curNode.getValue());
                System.out.println("level:" + step);
                if (curNode.getValue() == target) {
                    return step;
                }
                if (curNode.getChild().size() > 0) {
                    for (Node node : curNode.getChild()) {
                        queue.add(node);
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.getChild().add(new Node(2));
        root.getChild().add(new Node(3));
        root.getChild().get(0).getChild().add(new Node(5));
        root.getChild().get(0).getChild().add(new Node(4));

        int result = new bfs().bfs(root, 5);
        System.out.println("step:" + result);
    }
}
