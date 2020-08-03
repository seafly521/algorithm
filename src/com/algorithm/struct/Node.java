package com.algorithm.struct;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int value;
    private Node next;
    private List<Node> child = new ArrayList<Node>();

    public Node() {

    }

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public List<Node> getChild() {
        return child;
    }

    public void setChild(List<Node> child) {
        this.child = child;
    }
}
