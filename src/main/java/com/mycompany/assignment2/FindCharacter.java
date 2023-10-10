/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class FindCharacter {

    private int totalCharacters = 128;
    private int[] countArray;
    private int[] SequenceArray;
    private int count;
    public char nonRepeatingCharacter;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter the size: ");
            int size = s.nextInt();
            s.nextLine();
            char[] arr = new char[size];
            System.out.println("Enter the characters: ");
            for (int i = 0; i < size; i++) {
                arr[i] = s.next().charAt(0);
            }
            s.nextLine();
            FindCharacter FirstNonRepeating = new FindCharacter();
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
        } catch (NoSuchElementException e) {
            System.out.println("No such character exists");
        }
    }

    public FindCharacter() {
        countArray = new int[totalCharacters];
        SequenceArray = new int[totalCharacters];
        count = 0;
        nonRepeatingCharacter = '-';
    }

    public void add(char c) {
        int idx = (int) c;
        countArray[idx] = countArray[idx] + 1;
        SequenceArray[idx] = count++;
    }

    public void getFirstNonRepeatingCharacter() {
        int firstApperance = totalCharacters;
        char c;
        for (int i = 0; i < totalCharacters; i++) {
            c = (char) i;
            if (countArray[i] == 1) {
                if (SequenceArray[i] < firstApperance) {
                    nonRepeatingCharacter = c;
                    firstApperance = SequenceArray[i];
                }
            }
        }
    }
}
