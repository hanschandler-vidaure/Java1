package com.xpanxion.assignments.student;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1()
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        try
        {
            String name = console.nextLine().toUpperCase();
            System.out.println("Your name in upper case is: " + name + ".");
        } catch (Exception e)
        {
            System.out.println(e);
        }

    }

    public void ex2()
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        try
        {
            String name = console.nextLine();
            int uppercase = 0;
            for (int i = 0; i < name.length(); i++)
            {
                if (Character.isUpperCase(name.charAt(i)))
                    uppercase++;
            }
            System.out.println("Number of uppercase letters: " + uppercase + ".");
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void ex3() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        try
        {
            String string = console.nextLine();
            String[] stringArray = string.split(" ");
            boolean shift = true;
            for (String word : stringArray) {
                if (shift)
                {
                    System.out.print(word.toUpperCase() + " ");
                    shift = false;
                }
                else
                {
                    System.out.print(word + " ");
                    shift = true;
                }
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void ex4() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        try
        {
            String string = console.nextLine();
            boolean palindrome = true;
            for (int i = 0; i < string.length()/2; i++)
            {
                if (string.charAt(i) != string.charAt(string.length()-i-1))
                    palindrome = false;
            }
            if (palindrome)
                System.out.println("YES");
            else System.out.print("NO");
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void ex5() {
        char[] vowels = {'a','e','i','o','u'};
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        try
        {
            String string = console.nextLine();
            char[] characters = string.toCharArray();
            int v = 0;
            int c = 0;
            for (char charac : characters)
            {
                boolean isVowel = false;
                for (char vowel : vowels)
                    if (Character.toUpperCase(vowel) == Character.toUpperCase(charac))
                        isVowel = true;
                if (!isVowel) c++;
                else v++;
            }
            System.out.println(v);
            System.out.println(c);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void ex6() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = console.nextInt();
        System.out.print("Enter first number: ");
        int second = console.nextInt();
        System.out.println(first + second);
    }

    public void ex7() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = console.nextInt();
        System.out.print("Enter first number: ");
        int second = console.nextInt();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String option = console.next();
        System.out.print("Result: ");
        switch (option)
        {
            case "add" -> System.out.print(first + second);
            case "sub" -> System.out.print(first - second);
            case "mul" -> System.out.print(first * second);
            case "div" -> System.out.print(first / second);
            default -> System.out.print("Invalid operation");
        }
    }

    public void ex8() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter price per square feet: ");
        double price = console.nextDouble();
        double cost = 0f;
        while (true)
        {
            System.out.print("Enter room dimensions (width x height): ");
            String answer = console.next();
            if (answer.equalsIgnoreCase("done")) break;
            String[] dimensions = answer.split("x");
            cost = cost + (price * Integer.parseInt(dimensions[0]) * Integer.parseInt(dimensions[1]));
        }
        System.out.println("Total cost: " + cost);
    }

    public void ex9() {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(0,5);

        while (true) {
            System.out.print("Enter a number: ");
            int input = console.nextInt();
            if (input == random)
            {
                System.out.println("You guessed it!...");
                break;
            }
            else
                System.out.println("Try again...");
        }
    }

    public void ex10() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = console.nextLine();
        String[] array = input.split(" ");
        for (String word : array)
        {
            String space = "";
            char[] chars = word.toCharArray();
            for (char character : chars)
            {
                System.out.println(space + character);
                space += " ";
            }
        }

    }
}
