package it.sevenbits.workshop;

import it.sevenbits.workshop.doubleEndedQueue.DoubleEndedQueue;
import it.sevenbits.workshop.matrix.Matrix;



public class Main {
    public static void main(String[] args){
        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
//        Matrix matrix = new Matrix(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
//        System.out.println(matrix.toString());
//        matrix.inverseMatrix();
//        System.out.println(matrix);

        DoubleEndedQueue doubleEndedQueue = new DoubleEndedQueue();
        doubleEndedQueue.addLast(new Matrix(row, col));
        System.out.println("Добавлен элемент в конец очереди");
        System.out.println("Результат выполнения функции getFirst:");
        System.out.print(doubleEndedQueue.getFirst());
        System.out.println("Результат выполнения функции getLast:");
        System.out.print(doubleEndedQueue.getLast());
        doubleEndedQueue.addFirst(new Matrix(row, col));
        doubleEndedQueue.addFirst(new Matrix(row, col));
        System.out.println("Вся очередь:");
        System.out.print(doubleEndedQueue);
        System.out.println("Первый элемент очереди:");
        System.out.print(doubleEndedQueue.getFirst());
        System.out.println("Последний элемент очереди:");
        System.out.print(doubleEndedQueue.getLast());

    }
}
