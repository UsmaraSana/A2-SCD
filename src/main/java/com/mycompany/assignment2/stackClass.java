package com.mycompany.assignment2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hp
 * @param <T>
 */
public class stackClass<T> {

    private Node top;
    private int size;

    stackClass() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return true;
        } else {
            System.out.println("Stack is not empty!");
            return false;
        }

    }

    public int size() {
        System.out.println("Size: " + size);
        return size;
    }

    public void push(T data) {
        Node newnode = new Node(data);
        size = size + 1;
        if (top == null) {
            top = newnode;
        } else {
            newnode.setNext(top);
            top = newnode;
        }

    }

    public T pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty!");
        }
        size--;
        T value = (T) top.getData();
        top = top.getNext();
        System.out.println("Popped: " + value);
        return value;
    }

    public T peek() {
        System.out.println("Top element: " + top.getData());
        return (T) top.getData();
    }
}
