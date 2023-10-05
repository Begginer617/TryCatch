package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        System.out.println("Podaj pierwsza liczbe");
        int firstNumber;
        int secondnumber;
        boolean flag = true;


        while (flag) {
            try {
                Scanner scanner = new Scanner(System.in);
                secondnumber = scanner.nextInt();
                flag = false;
            } catch (InputMismatchException error1) {
                System.out.println("Tylko liczby sa przyjmowane");
            }
        }

        System.out.println("podaj druga liczbe wiesniaku1");


    }

    boolean flag = true;


        while (flag) {
        try {
            Scanner scanner = new Scanner(System.in);
            firstNumber = scanner.nextInt();
            flag = false;
        } catch (InputMismatchException error1) {
            System.out.println("Tylko liczby sa przyjmowane");
        }
    }



}



