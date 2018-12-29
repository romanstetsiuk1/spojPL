package latwe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Id438PrimeNumber {

    Scanner scanner = new Scanner(System.in);
    int userNumber = scanner.nextInt();

    boolean isPrimeNumber() {
        List<Integer> primeNumber = new ArrayList<Integer>();
        if (userNumber < 2) {
            System.out.println("It's not prime number");
            return false;
        }
        for (int i = 1; i <= userNumber; i++) {
            int counter = 0;
            for (int number = i; number >= 1; number--) {
                if (i % number == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primeNumber.add(i);
            }
        }

        if (primeNumber.contains(userNumber)) {
            System.out.println("It's prime number");
            return true;
        }
        System.out.println("It's not prime number");
        return false;
    }

}
