/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nonrepeating;

/**
 *
 * @author hp
 */
import java.util.Stack;
import java.util.LinkedList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class NonRepeating {
    private LinkedList<Character> l;
    private Stack<Character> s;
    public char nonRepeatingCharacter;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.println("Enter the size: ");
                int size = sc.nextInt();
                sc.nextLine();
                char[] arr = new char[size];
                System.out.println("Enter the characters: ");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.next().charAt(0);
                }
                sc.nextLine();
                NonRepeating FirstNonRepeating = new NonRepeating();
                for (int j = 0; j < size; j++) {
                    FirstNonRepeating.add(arr[j]);
                }
                System.out.print("The stream of characters is : {");
                for (int j = 0; j < size; j++) {
                    System.out.print(arr[j] + ",");
                }
                System.out.println("}");
                FirstNonRepeating.getFirstNonRepeatingCharacter();
                System.out.println("The first non-repeating character is: " + FirstNonRepeating.nonRepeatingCharacter);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter an integer ");
            } 
            catch (NoSuchElementException e) {
                System.out.println("No such character exists");
            }
        }
    }

    public NonRepeating() {
        s=new Stack<>();
        l=new LinkedList<>();
        nonRepeatingCharacter = '-';
    }

    public void add(char c) {
        if(l.contains(c)){
            l.remove((Character)c);
        }
        else{
            l.add(c);
            s.push(c);
        }
    }

    public void getFirstNonRepeatingCharacter() {
    nonRepeatingCharacter = '-';
    while (!s.isEmpty()) {
        char current = s.peek();
        if (l.contains(current) && l.getFirst() == current) {
            nonRepeatingCharacter = current;
            return;
        } else {
            s.pop();
        }
    }
}
}
