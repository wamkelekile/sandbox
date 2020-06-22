import java.util.Scanner;

public class Superduper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       String name;

        do {
            System.out.println("What is your name?");
            name = scanner.nextLine();

        } while (name.isEmpty());


        System.out.println("How old are your really?");

        int age = Integer.parseInt(scanner.nextLine());

        Person firstPerson = new Person(name, age);

        /*copied the input code*/


        do {
            System.out.println("What is your name?");
            name = scanner.nextLine();

        } while (name.isEmpty());


        System.out.println("How old are your really?");

        age = Integer.parseInt(scanner.nextLine());
        Person secondPerson = new Person(name, age);



        System.out.println("your name is " + firstPerson.actualName + " and your age is " + firstPerson.actualAge);
        System.out.println("your name is " + secondPerson.actualName + " and your age is " + secondPerson.actualAge);
    }
}
