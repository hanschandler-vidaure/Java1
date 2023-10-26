package com.xpanxion.assignments.student;

import com.xpanxion.assignments.stu0.*;

import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class JavaTwo {
    public void ex1()
    {
        Scanner console = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<Person>();
        while (true)
        {
            System.out.print("Enter Person: ");
            String input = console.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            String[] answer = input.split(" ");
            int number = Integer.parseInt(answer[0].substring(0,answer[0].length()-1));
            Person p = new Person(number, answer[1], answer[2]);
            people.add(p);
        }
        for (Person p : people)
            System.out.println(p.toString());
    }
    public void ex2()
    {
        Scanner console = new Scanner(System.in);
        HashMap<Integer, Person> map = new HashMap<Integer, Person>();
        while (true)
        {
            System.out.print("Enter Person ID and Full Name: ");
            String input = console.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            String[] answer = input.split(" ");
            int number = Integer.parseInt(answer[0].substring(0,answer[0].length()-1));
            Person p = new Person(number, answer[1], answer[2]);
            map.put(number,p);
        }
    }
    public void ex3()
    {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
    public void ex4()
    {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }
    public void ex5()
    {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p.toString());
    }
    public void ex6()
    {
        Scanner console = new Scanner(System.in);
        String input = "";
        String history = "";
        while (!input.equalsIgnoreCase("done"))
        {
            System.out.print("Enter first number: ");
            input = console.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            int x = Integer.parseInt(input);

            System.out.print("Enter second number: ");
            input = console.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            int y = Integer.parseInt(input);

            System.out.print("Enter operation (add, sub, mul, div): ");
            int result = 0;
            input = console.nextLine();
            switch (input)
            {
                case "add":
                {
                    result = x + y;
                    history = x + " + " + y + " = " + result + "\n";
                    break;
                }
                case "sub":
                {
                    result = x - y;
                    history = x + " + " + y + " = " + result + "\n";
                    break;
                }
                case "mul":
                {
                    result = x * y;
                    history = x + " * " + y + " = " + result + "\n";
                    break;
                }
                case "div":
                {
                    result = x / y;
                    history = x + " / " + y + " = " + result + "\n";
                    break;
                }
                default:
                {
                    break;
                }
            }
            System.out.println("Result: " + result);
        }
    }

    public void ex7()
    {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );
        List<Person> newPersonList = personList.stream()
                .map(person -> new Person(person.getId(), person.getFirstName(),"xxx")).collect(Collectors.toList());
        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }
    public void ex8()
    {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );
        List<Person> newPersonList = personList.stream().sorted(Person::compareTo).toList();
        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }
    public void ex9()
    {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        List<Person> filteredList = personList.stream().filter(p -> p.getLastName().equals("Smith")).toList();

        for (Person p : filteredList) {
            System.out.println(p);
        }
    }
    public void ex10() throws InterruptedException {
        LinkedList<Cat> cats = new LinkedList<Cat>();
        cats.add(new Cat("Alice"));
        cats.add(new Cat("Bob"));
        cats.add(new Cat("Charlie"));
        cats.add(new Cat("Dan"));
        int size = cats.size();
        for (int i = 0; i<size;i++)
        {
            System.out.println(cats);
            cats.removeFirst();
            Thread.sleep(3000);
        }

    }
}
