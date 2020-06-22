import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String carMake;
        String carModel;


        System.out.println("Maker of the car you want to buy?");
        do {
            System.out.println("Please provide maker of the car you want to buy");
            carMake = scanner.nextLine();
        } while (carMake.isEmpty());


        System.out.println("Model of the car you want to buy?");
        do {
            System.out.println("Please provide model of the car you want to buy");
            carModel = scanner.nextLine();
        } while (carModel.isEmpty());


        Car boughtCar = new Car(carMake, carModel);

        System.out.println("You just bought a " + boughtCar.make + " " + boughtCar.model);

        System.out.println("Would you like to buy another car? | Answer YES or NO");
        String answer = scanner.nextLine();

        switcher(answer);

    }

    private static void switcher(String answer)
    {
        switch (answer.toUpperCase())
        {
            case "YES":
                System.out.println("We are happy");
                break;
            case "NO":
                System.out.println("Okay, bye");
                break;
            default:
                System.out.println("Sorry, your answer was wrong!");
        }
    }
}

