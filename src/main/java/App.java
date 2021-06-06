import java.util.Scanner;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        //initiate scannner
        Scanner sc = new Scanner(System.in);
//input
        System.out.print("What is your age? ");
        int age = sc.nextInt();

//calculation

        //userInput.equals("B")
        String decision = (age <= 18) ? "You are not old enough to legally drive.." : "You are old enough to legally drive.";
        System.out.println(decision);
    }
}