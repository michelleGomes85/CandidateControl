package dio.main;

import java.util.Scanner;

import dio.exceptions.InvalidParametersException;

public class Accountant {
    public static void main(String[] args) {
        new Accountant().init();
    }

    private void init() {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Enter the first parameter:");
        int firstParameter = terminal.nextInt();

        System.out.println("Enter the second parameter:");
        int secondParameter = terminal.nextInt();

        try {
            count(firstParameter, secondParameter);
        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        }

        terminal.close();
    }

    private void count(int firstParameter, int secondParameter) throws InvalidParametersException {
        
    	if (firstParameter >= secondParameter) {
            throw new InvalidParametersException("The second parameter must be greater than the first");
        }

        int count = secondParameter - firstParameter;

        for (int i = 1; i <= count; i++) {
            System.out.println("Printing number " + i);
        }
    }
}