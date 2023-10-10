/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignment2;
import java.util.*;

/**
 *
 * @author hp
 */
public class Assignment2 {

    public static void main(String[] args) {
        System.out.print("      INTEGER STACK! \nEnter the size of stack:");
        Scanner s = new Scanner(System.in);
        try{
            int value = s.nextInt();
            s.nextLine();
        System.out.println("Enter the values in stack:");
        stackClass<Integer> i = new stackClass<>();
        for (int j = 0; j < value; j++) {
            int val = s.nextInt();
            i.push(val);
        }
        System.out.print("1-push, 2- pop, 3-peek, 4-size, 5-Empty, 6-Exit \n Enter your choice: ");
        int x;
        do {
            x = s.nextInt();
            s.nextLine();
            switch (x) {
                case 1:
                    System.out.println("Enter the value to push: ");
                    int y = s.nextInt();
                    s.nextLine();
                    i.push(y);
                    break;
                case 2:
                    i.pop();
                    break;
                case 3:
                    i.peek();
                    break;
                case 4:
                    i.size();
                    break;
                case 5:
                    i.isEmpty();
                    break;
            }
            System.out.println("Enter your choice: ");
        } while (x != 6);

        stackClass<String> st = new stackClass<>();
        System.out.print("\n\n      STRING STACK! \nEnter the size of stack:");
        int strl = s.nextInt();
        s.nextLine();
        System.out.print("Enter the values of stack:");
        for (int j = 0; j < strl; j++) {
            String str = s.nextLine();
            st.push(str);
        }
        System.out.print("1-push, 2- pop, 3-peek, 4-size, 5-Empty, 6-Exit \n Enter your choice: ");
        int u;
        do {
            u = s.nextInt();
            s.nextLine();
            switch (u) {
                case 1:
                    System.out.println("Enter the value to push: ");
                    String y = s.nextLine();
                    s.nextLine();
                    st.push(y);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.size();
                    break;
                case 5:
                    st.isEmpty();
                    break;
            }
            System.out.println("Enter your choice: ");
        } while (u != 6);
        
        stackClass<Float> f = new stackClass<>();
        System.out.print("\n\n      FLOAT STACK! \nEnter the size of stack:");
        int fl = s.nextInt();
        s.nextLine();
        System.out.print("Enter the values of stack:");
        for (int j = 0; j < fl; j++) {
            Float str = s.nextFloat();
            f.push(str);
        }
        System.out.print("1-push, 2- pop, 3-peek, 4-size, 5-Empty, 6-Exit \n Enter your choice: ");
        int z;
        do {
            z = s.nextInt();
            s.nextLine();
            switch (z) {
                case 1:
                    System.out.println("Enter the value to push: ");
                    Float y = s.nextFloat();
                    s.nextLine();
                    f.push(y);
                    break;
                case 2:
                    f.pop();
                    break;
                case 3:
                    f.peek();
                    break;
                case 4:
                    f.size();
                    break;
                case 5:
                    f.isEmpty();
                    break;
            }
            System.out.println("Enter your choice: ");
        } while (z != 6);
        }catch(InputMismatchException e){
            System.out.println("Invalid input format! " );
        }
    }
}
