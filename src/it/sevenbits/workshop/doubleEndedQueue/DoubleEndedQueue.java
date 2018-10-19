package it.sevenbits.workshop.doubleEndedQueue;

import it.sevenbits.workshop.matrix.Matrix;

public class DoubleEndedQueue {
    private Node first;
    private Node last;

    public DoubleEndedQueue() {
        first = null;
        last = null;
    }

    public Matrix getFirst() {
        return first.getMatrix();
    }

    public Matrix getLast() {
        return last.getMatrix();
    }

    public void addFirst(Matrix matrix) {
        Node node = new Node(matrix);
        if (first != null) {
            first.setPrevious(node);
            node.setNext(first);
            first = node;
        } else {
            first = last = node;
        }
    }

    public void addLast(Matrix matrix) {
        Node node = new Node(matrix);
        if (last != null) {
            node.setPrevious(last);
            last.setNext(node);
            last = node;
        } else {
            first = last = node;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node node = first;
        for (int i = 1; node != null; i++) {
            sb.append(i).append("-й элемент очереди: \n");
            sb.append(node);
            node = node.getNext();
        }
        return sb.toString();
    }
}
