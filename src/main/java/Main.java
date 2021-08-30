/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min_age=16;
        System.out.print("What is your age: ");
        String Str1 = input.nextLine();
        int age= Integer.parseInt(Str1);
        String output= age>=min_age?"You are old enough to legally drive":
                "You are not old enough to legally drive";
        System.out.println(output);
    }
}