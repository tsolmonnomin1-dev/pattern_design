package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Singleton pattern, 2 for Factory pattern, 3 for Prototype pattern: ");
        choice = sc.nextInt();
        switch(choice) {
            case 1:
                com.example.daalgavar_1.Program.main(args);
                break;
            case 2:
                com.example.daalgavar_2.Main.main(args);
                break;
            case 3:
                com.example.daalgavar_3.MainProgram.main(args);
                break;
            default:
                System.out.println("Hello World!");
        }
        sc.close();
    } 
}
