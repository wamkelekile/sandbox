public class PrimeNumbers {

    public static void main(String[] args) {
        int c=1000;

        for (int number = 1; number <= c; number++)
        {

            /*boolean isPrime = true;

            for (int divisor = 2; divisor < number/2; divisor++)
            {
                if (number % divisor == 0) {
                    isPrime = false;
                    break; // exit the inner for loop
                }
            }

            if (isPrime) {
               System.out.println(number + ", ");
            }*/
            if (number == c) {
                System.out.print(number);
            }else {
                    System.out.print(number+2);
            }

        }

    }
}
