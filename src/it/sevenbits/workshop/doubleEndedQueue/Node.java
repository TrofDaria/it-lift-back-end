package it.sevenbits.workshop.doubleEndedQueue;

import it.sevenbits.workshop.matrix.Matrix;

class Node {
    private Node next;
    private Node previous;
    private Matrix matrix;

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public Node(Matrix matrix){
        next = null;
        previous = null;
        this.matrix = matrix;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Лист:\n").append(matrix).append("\n");
        return sb.toString();
    }
}
